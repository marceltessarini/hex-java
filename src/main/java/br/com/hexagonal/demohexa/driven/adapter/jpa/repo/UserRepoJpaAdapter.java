package br.com.hexagonal.demohexa.driven.adapter.jpa.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.hexagonal.demohexa.core.domain.model.User;
import br.com.hexagonal.demohexa.core.domain.port.UserRepoPort;
import br.com.hexagonal.demohexa.driven.adapter.jpa.entity.UserJpaEntity;

@Component
public class UserRepoJpaAdapter implements UserRepoPort {
    @Autowired 
    private  UserRepoSpringData jpaRepository; 
        
	@Override
	public User save(User user) {
		var userEntity = new UserJpaEntity();
		
		userEntity.setCpf(user.getCpf());
		userEntity.setName(user.getName());
		userEntity.setStatus(user.getStatus());
		userEntity.setRate(user.getRate());		

		var saved = this.jpaRepository.save(userEntity);
		
		var savedUser = new User();
		
		savedUser.setId(saved.getId());
		savedUser.setCpf(saved.getCpf());
		savedUser.setName(saved.getName());
		savedUser.setStatus(saved.getStatus());
		savedUser.setRate(saved.getRate());
		
		return savedUser;
	}

}
