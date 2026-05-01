package br.com.hexagonal.demohexa.core.application.port.output;

import br.com.hexagonal.demohexa.core.domain.model.User;

public interface UserCreatedPublisherPort {
	public void publish(User user);
}
