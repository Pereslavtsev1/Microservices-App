package org.example.paymentservice.kafkaConfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaPaymentConfig {

    @Bean
    public NewTopic orderTopic() {
        return TopicBuilder.name("order-config").build();
    }
}
