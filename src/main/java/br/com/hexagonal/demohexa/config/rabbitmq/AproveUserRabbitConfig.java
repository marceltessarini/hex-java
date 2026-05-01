package br.com.hexagonal.demohexa.config.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AproveUserRabbitConfig {
	public static final String APPROVE_USER_EXCHANGE = "approve-user-exchange";
	public static final String APPROVE_USER_QUEUE = "approve-user-queue";

	@Bean
	public Queue approveUserQueue() {
		return new Queue(APPROVE_USER_QUEUE, false);
	}

	@Bean
	public TopicExchange approveUserExchange() {
		return new TopicExchange(APPROVE_USER_EXCHANGE);
	}

	@Bean
	public Binding bindingApproveUserQueue(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with("routing.key.approve.user");
	}
}
