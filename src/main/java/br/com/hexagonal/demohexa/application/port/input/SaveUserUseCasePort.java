package br.com.hexagonal.demohexa.application.port.input;

import br.com.hexagonal.demohexa.domain.dto.SaveUserDto;
import br.com.hexagonal.demohexa.domain.model.User;

public interface SaveUserUseCasePort {
	public User execute(SaveUserDto saveUserDto);
}
