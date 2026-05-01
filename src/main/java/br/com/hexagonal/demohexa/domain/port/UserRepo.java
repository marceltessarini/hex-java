package br.com.hexagonal.demohexa.domain.port;

import br.com.hexagonal.demohexa.domain.model.User;

public interface UserRepo {
	public User save(User user);
}
