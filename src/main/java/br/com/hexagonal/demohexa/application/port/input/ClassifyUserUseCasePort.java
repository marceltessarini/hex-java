package br.com.hexagonal.demohexa.application.port.input;

import br.com.hexagonal.demohexa.domain.dto.ClassifyUserDto;
import br.com.hexagonal.demohexa.domain.model.User;

public interface ClassifyUserUseCasePort {
	public User execute(ClassifyUserDto classifyUserDto);
}
