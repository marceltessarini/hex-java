package br.com.hexagonal.demohexa.driven.adapter.jpa.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.hexagonal.demohexa.domain.model.User;
import br.com.hexagonal.demohexa.domain.port.UserRepo;
import br.com.hexagonal.demohexa.driven.adapter.jpa.entity.UserJpaEntity;

@Component
public class UserRepoJpa implements UserRepo {
    @Autowired 
    private  UserRepoSpringData jpaRepository; 
        
	@Override
	public User save(User user) {
		var userEntity = new UserJpaEntity();
		
		userEntity.setCpf(user.getCpf());
		userEntity.setName(user.getName());
		userEntity.setStatus(user.getStatus());
		userEntity.setId(user.getId());
		
		var saved = this.jpaRepository.save(userEntity);
		
		var savedUser = new User();
		
		savedUser.setCpf(saved.getCpf());
		savedUser.setId(saved.getId());
		savedUser.setName(saved.getName());
		savedUser.setStatus(saved.getStatus());
		
		return savedUser;
	}

}
