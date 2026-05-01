package br.com.hexagonal.demohexa.driven.adapter.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.hexagonal.demohexa.application.port.output.UserCreatedPublisherPort;
import br.com.hexagonal.demohexa.config.rabbitmq.AproveUserRabbitConfig;
import br.com.hexagonal.demohexa.domain.model.User;

@Component
public class RabbitMQUserCreatedPublisherAdapter implements UserCreatedPublisherPort {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public void publish(User user) {
		rabbitTemplate.convertAndSend(AproveUserRabbitConfig.APPROVE_USER_EXCHANGE, AproveUserRabbitConfig.ROUTING_KEY_APPROVE_USER, user);
	}

}
