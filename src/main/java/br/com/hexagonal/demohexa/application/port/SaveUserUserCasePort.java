package br.com.hexagonal.demohexa.application.port;

import br.com.hexagonal.demohexa.domain.dto.SaveUserDto;
import br.com.hexagonal.demohexa.domain.model.User;

public interface SaveUserUserCasePort {
	public User saveUser(SaveUserDto saveUserDto);
}
