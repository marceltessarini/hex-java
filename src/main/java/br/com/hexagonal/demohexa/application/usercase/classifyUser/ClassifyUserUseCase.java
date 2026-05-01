package br.com.hexagonal.demohexa.application.usercase.classifyUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hexagonal.demohexa.application.port.input.ClassifyUserUseCasePort;
import br.com.hexagonal.demohexa.domain.dto.ClassifyUserDto;
import br.com.hexagonal.demohexa.domain.model.User;
import br.com.hexagonal.demohexa.domain.service.ClassifyUserService;

@Service
public class ClassifyUserUseCase implements ClassifyUserUseCasePort {
	
	@Autowired
	private ClassifyUserService classifyUserService;

	@Override
	public User execute(ClassifyUserDto classifyUserDto) {
		return classifyUserService.classify(classifyUserDto);
	}

}
