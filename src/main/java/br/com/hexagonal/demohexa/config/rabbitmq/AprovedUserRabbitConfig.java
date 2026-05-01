package br.com.hexagonal.demohexa.config.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AprovedUserRabbitConfig {
	public static final String APPROVED_USER_EXCHANGE = "approved-user-exchange";
	public static final String APPROVED_USER_QUEUE = "approved-user-queue";
	public static final String ROUTING_KEY_APPROVED_USER = "routing.key.approved.user";

	@Bean
	Queue approvedUserQueue() {
		return new Queue(APPROVED_USER_QUEUE, false);
	}

	@Bean
	TopicExchange approvedUserExchange() {
		return new TopicExchange(APPROVED_USER_EXCHANGE);
	}

	@Bean
	Binding bindingApprovedUserQueue(@Qualifier("approvedUserQueue") Queue queue,
			@Qualifier("approvedUserExchange") TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY_APPROVED_USER);
	}
}
