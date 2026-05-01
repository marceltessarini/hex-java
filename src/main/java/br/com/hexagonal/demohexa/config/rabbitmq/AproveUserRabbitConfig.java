package br.com.hexagonal.demohexa.config.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AproveUserRabbitConfig {
	public static final String APPROVE_USER_EXCHANGE = "approve-user-exchange";
	public static final String APPROVE_USER_QUEUE = "approve-user-queue";
	public static final String ROUTING_KEY_APPROVE_USER = "routing.key.approve.user";

	@Bean
	Queue approveUserQueue() {
		return new Queue(APPROVE_USER_QUEUE, false);
	}

	@Bean
	TopicExchange approveUserExchange() {
		return new TopicExchange(APPROVE_USER_EXCHANGE);
	}

	@Bean
	Binding bindingApproveUserQueue(@Qualifier("approveUserQueue") Queue queue,
			@Qualifier("approveUserExchange") TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY_APPROVE_USER);
	}
}
