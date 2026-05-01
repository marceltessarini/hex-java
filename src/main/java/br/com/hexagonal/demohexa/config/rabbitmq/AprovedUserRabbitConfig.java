package br.com.hexagonal.demohexa.config.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AprovedUserRabbitConfig {
	public static final String APPROVED_USER_EXCHANGE = "approved-user-exchange";
	public static final String APPROVED_USER_QUEUE = "approved-user-queue";

    @Bean
    public Queue approvedUserQueue() { return new Queue(APPROVED_USER_QUEUE, false); }

    @Bean
    public TopicExchange approvedUserExchange() { return new TopicExchange(APPROVED_USER_EXCHANGE); }

    @Bean
    public Binding bindingApprovedUserQueue(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("routing.key.approve.user");
    }
}
