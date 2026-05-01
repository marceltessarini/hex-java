package br.com.hexagonal.demohexa.core.application.port.input;

import br.com.hexagonal.demohexa.core.domain.dto.ClassifyUserDto;
import br.com.hexagonal.demohexa.core.domain.model.User;

public interface ClassifyUserUseCasePort {
	public User execute(ClassifyUserDto classifyUserDto);
}
