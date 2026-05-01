package br.com.hexagonal.demohexa.core.application.port.input;

import br.com.hexagonal.demohexa.core.domain.dto.SaveUserDto;
import br.com.hexagonal.demohexa.core.domain.model.User;

public interface SaveUserUseCasePort {
	public User execute(SaveUserDto saveUserDto);
}
