package br.com.hexagonal.demohexa.infrastructure.adapter.persistence.jpa.repo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hexagonal.demohexa.domain.model.User;
import br.com.hexagonal.demohexa.domain.port.UserRepo;
import br.com.hexagonal.demohexa.infrastructure.adapter.persistence.jpa.entity.UserJpaEntity;

@Repository()
public class UserRepoJpa implements UserRepo {
    @Autowired 
    private  JpaRepository <UserJpaEntity, UUID> jpaRepository; 
    
	@Override
	public User save(User user) {
//		return this.jpaRepository.save(user);
		return null;
	}

}
