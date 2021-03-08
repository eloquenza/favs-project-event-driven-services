package edu.hsh.favs.project.escqrs.services.businessintelligenceservice.processing;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.hsh.favs.project.escqrs.events.customer.CustomerCreatedEvent;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.springframework.messaging.Message;
import org.springframework.messaging.converter.AbstractMessageConverter;
import org.springframework.util.MimeType;
import reactor.util.Logger;
import reactor.util.Loggers;

public class JsonToCustomerCreatedEventConverter extends AbstractMessageConverter {
  private final Logger log = Loggers.getLogger(JsonToCustomerCreatedEventConverter.class.getName());

  public JsonToCustomerCreatedEventConverter() {
    super(new MimeType("application", "json"));
  }

  @Override
  protected boolean supports(Class<?> clazz) {
    return (CustomerCreatedEvent.class == clazz);
  }

  @Override
  protected CustomerCreatedEvent convertFromInternal(
      Message<?> message, Class<?> targetClass, Object conversionHint) {
    log.info("Logging message from inside the converter: " + message);
    Object payload = message.getPayload();
    log.info(
        "Logging payload from inside the converter: "
            + new String((byte[]) payload, StandardCharsets.UTF_8));
    try {
      return new ObjectMapper().readValue((byte[]) payload, CustomerCreatedEvent.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
