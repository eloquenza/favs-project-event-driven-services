package edu.hsh.favs.project.escqrs.services.orderservice.service;

import edu.hsh.favs.project.escqrs.domains.orders.Order;
import edu.hsh.favs.project.escqrs.events.order.factories.OrderCreatedEventFactory;
import edu.hsh.favs.project.escqrs.services.commons.DualWriteTransactionHelper;
import edu.hsh.favs.project.escqrs.services.orderservice.orders.repository.OrderRepository;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.reactive.TransactionalOperator;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.Logger;
import reactor.util.Loggers;

@Service
public class OrderService {

  private final Logger log = Loggers.getLogger(OrderService.class.getName());
  private final OrderRepository repo;
  private final R2dbcEntityTemplate template;
  private final TransactionalOperator txOperator;

  public OrderService(
      OrderRepository repo, R2dbcEntityTemplate template, TransactionalOperator txOperator) {
    this.repo = repo;
    this.template = template;
    this.txOperator = txOperator;
  }

  public Mono<Order> findOrderById(Long orderId) {
    return repo.findById(orderId);
  }

  public Flux<Order> findAllOrders() {
    return repo.getAllOrders();
  }

  public Mono<Order> createOrder(Order order, OrderCreatedEventFactory eventFactory, Source messageBroker) {
    return DualWriteTransactionHelper.createEntityControlFlowTemplate(
        template,
        txOperator,
        order,
        log,
        eventFactory,
        messageBroker,
        repo.findById(order.getOrderid()));
  }
}
