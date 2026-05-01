package br.com.hexagonal.demohexa.core.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hexagonal.demohexa.core.domain.dto.SaveUserDto;
import br.com.hexagonal.demohexa.core.domain.model.User;
import br.com.hexagonal.demohexa.core.domain.model.UserStatus;
import br.com.hexagonal.demohexa.core.domain.port.UserRepoPort;

@Service
public class SaveUserService {
	
	@Autowired
	private UserRepoPort userRepo;

	public User save(SaveUserDto saveUserDto) {
		var user = new User();
		
		user.setCpf(saveUserDto.cpf());
		user.setName(saveUserDto.name());
		user.setStatus(UserStatus.PENDING_RATING);
		
		return userRepo.save(user);
	}
}
