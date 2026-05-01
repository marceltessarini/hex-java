package br.com.hexagonal.demohexa.domain.port;

import br.com.hexagonal.demohexa.domain.model.User;

public interface UserRepoPort {
	public User save(User user);
}
