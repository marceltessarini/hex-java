package br.com.hexagonal.demohexa.config.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RatingUserRabbitConfig {
	public static final String RATING_USER_EXCHANGE = "rating-user-exchange";
	public static final String RATING_USER_QUEUE = "rating-user-queue";
	public static final String ROUTING_KEY_RATING_USER = "routing.key.rating.user";

	@Bean
	Queue ratingUserQueue() {
		return new Queue(RATING_USER_QUEUE, false);
	}

	@Bean
	TopicExchange ratingUserExchange() {
		return new TopicExchange(RATING_USER_EXCHANGE);
	}

	@Bean
	Binding bindingApproveUserQueue(@Qualifier("ratingUserQueue") Queue queue,
			@Qualifier("ratingUserExchange") TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY_RATING_USER);
	}
}
