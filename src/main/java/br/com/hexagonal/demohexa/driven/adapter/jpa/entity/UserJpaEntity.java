package br.com.hexagonal.demohexa.driven.adapter.jpa.entity;

import java.util.UUID;

import br.com.hexagonal.demohexa.core.domain.model.UserStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Table(name = "users")
@Entity
public class UserJpaEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(length = 500, nullable = false)
	@NotNull
	private String name;
	
	@Column(length = 11, nullable = false)
	@NotNull
	private String cpf;
	
	@Column(nullable = true)
	private Integer rate;
	
    @NotNull
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserStatus status;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}
}
