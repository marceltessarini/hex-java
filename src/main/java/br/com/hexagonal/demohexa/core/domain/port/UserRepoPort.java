package br.com.hexagonal.demohexa.core.domain.port;

import br.com.hexagonal.demohexa.core.domain.model.User;

public interface UserRepoPort {
	public User save(User user);
}
