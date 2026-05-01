package br.com.hexagonal.demohexa.domain.service;

import org.springframework.stereotype.Service;

import br.com.hexagonal.demohexa.domain.dto.SaveUserDto;
import br.com.hexagonal.demohexa.domain.model.User;
import br.com.hexagonal.demohexa.driven.adapter.jpa.entity.UserJpaEntity;

@Service()
public class SaveUserService {

	public User saveUser(SaveUserDto saveUserDto) {
		// TODO impl
		return null;
	}
}
