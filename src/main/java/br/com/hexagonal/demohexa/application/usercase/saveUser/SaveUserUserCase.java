package br.com.hexagonal.demohexa.application.usercase.saveUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hexagonal.demohexa.application.port.input.SaveUserUserCasePort;
import br.com.hexagonal.demohexa.domain.dto.SaveUserDto;
import br.com.hexagonal.demohexa.domain.model.User;
import br.com.hexagonal.demohexa.domain.service.SaveUserService;

@Service
public class SaveUserUserCase implements SaveUserUserCasePort {

	@Autowired
	private SaveUserService saveUserService;
	
	@Override
	public User saveUser(SaveUserDto saveUserDto) {
		
		var savedUser = this.saveUserService.save(saveUserDto);
		
		return savedUser;
	}

}
