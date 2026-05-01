package br.com.hexagonal.demohexa.application.port.input;

import br.com.hexagonal.demohexa.domain.dto.SaveUserDto;
import br.com.hexagonal.demohexa.domain.model.User;

public interface SaveUserUserCasePort {
	public User execute(SaveUserDto saveUserDto);
}
