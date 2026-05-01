package br.com.hexagonal.demohexa.application.port.output;

import br.com.hexagonal.demohexa.domain.model.User;

public interface UserCreatedPublisherPort {
	public void publish(User user);
}
