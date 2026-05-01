package br.com.hexagonal.demohexa.driven.adapter.event.user;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.hexagonal.demohexa.application.port.output.UserCreatedPublisherPort;
import br.com.hexagonal.demohexa.config.rabbitmq.AproveUserRabbitConfig;
import br.com.hexagonal.demohexa.domain.model.User;
import br.com.hexagonal.demohexa.driven.adapter.event.user.message.ApproveUserMessage;

@Component
public class UserCreatedPublisherRabbitMQAdapter implements UserCreatedPublisherPort {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public void publish(User user) {
		var approveUserMessage = new ApproveUserMessage(user.getId(), user.getName(), user.getCpf());
		rabbitTemplate.convertAndSend(AproveUserRabbitConfig.APPROVE_USER_EXCHANGE,
				AproveUserRabbitConfig.ROUTING_KEY_APPROVE_USER, approveUserMessage);
	}

}
