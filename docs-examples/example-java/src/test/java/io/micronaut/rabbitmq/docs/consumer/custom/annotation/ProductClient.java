package io.micronaut.rabbitmq.docs.consumer.custom.annotation;

import io.micronaut.rabbitmq.annotation.Binding;
import io.micronaut.rabbitmq.annotation.RabbitClient;
import io.micronaut.context.annotation.Requires;

@Requires(property = "spec.name", value = "DeliveryTagSpec")
@RabbitClient
public interface ProductClient {

    @Binding("product")
    void send(byte[] data);
}