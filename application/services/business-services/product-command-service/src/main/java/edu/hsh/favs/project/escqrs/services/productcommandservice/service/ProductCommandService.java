package edu.hsh.favs.project.escqrs.services.productcommandservice.service;

import edu.hsh.favs.project.escqrs.domains.products.Product;
import edu.hsh.favs.project.escqrs.events.product.factories.ProductAddedEventFactory;
import edu.hsh.favs.project.escqrs.events.product.factories.ProductUpdatedEventFactory;
import edu.hsh.favs.project.escqrs.services.commons.transactions.DualWriteTransactionHelper;
import edu.hsh.favs.project.escqrs.services.commons.transactions.EntityUpdater;
import edu.hsh.favs.project.escqrs.services.productcommandservice.repository.ProductCommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.reactive.TransactionalOperator;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.Logger;
import reactor.util.Loggers;

@Service
public class ProductCommandService {

  private final Logger log = Loggers.getLogger(ProductCommandService.class.getName());
  private final ProductCommandRepository repo;
  private final ProductAddedEventFactory addEventFactory;
  private final ProductUpdatedEventFactory updateEventFactory;
  private final DualWriteTransactionHelper<Product> dualWriteHelper;
  private final EntityUpdater<Product> entityUpdater;

  @Autowired
  public ProductCommandService(
      ProductCommandRepository repo,
      R2dbcEntityTemplate template,
      TransactionalOperator txOperator,
      Source messageBroker) {
    this.repo = repo;
    this.addEventFactory = new ProductAddedEventFactory();
    this.updateEventFactory = new ProductUpdatedEventFactory();
    this.dualWriteHelper =
        new DualWriteTransactionHelper<>(template, txOperator, messageBroker, log);
    this.entityUpdater = new EntityUpdater<>(log);
  }

  public Mono<Product> findProductById(Long productId) {
    return repo.findById(productId);
  }

  public Flux<Product> findAllProducts() {
    return repo.getAllProducts();
  }

  public Mono<Product> addProduct(Product product) {
    return dualWriteHelper.createEntity(product, addEventFactory);
  }

  public Mono<Product> updateProduct(Long productId, Product updatedProduct) {
    return this.repo
        .findById(productId)
        .flatMap(
            product ->
                dualWriteHelper.updateEntity(
                    entityUpdater.update(product, updatedProduct),
                    updateEventFactory.supplyEntity(updatedProduct.setId(product.getId()))));
  }
}
