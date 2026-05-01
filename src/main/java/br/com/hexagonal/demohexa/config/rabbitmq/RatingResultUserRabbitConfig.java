package br.com.hexagonal.demohexa.config.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RatingResultUserRabbitConfig {
	public static final String RATING_RESULT_USER_EXCHANGE = "rating-result-user-exchange";
	public static final String RATING_RESULT_USER_QUEUE = "rating-result-user-queue";
	public static final String ROUTING_KEY_RATING_RESULT_USER = "routing.key.rating.result.user";

	@Bean
	Queue ratingResultUserQueue() {
		return new Queue(RATING_RESULT_USER_QUEUE, false);
	}

	@Bean
	TopicExchange ratingResultUserExchange() {
		return new TopicExchange(RATING_RESULT_USER_EXCHANGE);
	}

	@Bean
	Binding bindingApprovedUserQueue(@Qualifier("ratingResultUserQueue") Queue queue,
			@Qualifier("ratingResultUserExchange") TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY_RATING_RESULT_USER);
	}
}
