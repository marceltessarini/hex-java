package br.com.hexagonal.demohexa.driven.adapter.jpa.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.hexagonal.demohexa.domain.model.User;
import br.com.hexagonal.demohexa.domain.port.UserRepo;

@Component
public class UserRepoJpa implements UserRepo {
    @Autowired 
    private  UserRepoSpringData jpaRepository; 
        
	@Override
	public User save(User user) {
//		return this.jpaRepository.save(user);
		return null;
	}

}
