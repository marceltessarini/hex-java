package br.com.hexagonal.demohexa.driven.adapter.jpa.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.hexagonal.demohexa.driven.adapter.jpa.entity.UserJpaEntity;

@Repository
public interface UserRepoSpringData extends JpaRepository<UserJpaEntity, UUID> {
}