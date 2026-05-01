package br.com.hexagonal.demohexa.application.usercase.saveUser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hexagonal.demohexa.application.port.input.SaveUserUserCasePort;
import br.com.hexagonal.demohexa.domain.dto.SaveUserDto;
import br.com.hexagonal.demohexa.domain.model.User;
import br.com.hexagonal.demohexa.domain.service.SaveUserService;
import br.com.hexagonal.demohexa.driven.adapter.event.user.UserCreatedPublisherRabbitMQAdapter;

@Service
public class SaveUserUserCase implements SaveUserUserCasePort {

    private static final Logger logger = LoggerFactory.getLogger(UserCreatedPublisherRabbitMQAdapter.class);

	@Autowired
	private SaveUserService saveUserService;
	
	@Override
	public User execute(SaveUserDto saveUserDto) {
		logger.info("Executing save user use case.");
		var savedUser = this.saveUserService.save(saveUserDto);
		
		return savedUser;
	}

}
