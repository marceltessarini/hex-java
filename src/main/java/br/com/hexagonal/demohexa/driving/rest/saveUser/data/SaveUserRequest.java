package br.com.hexagonal.demohexa.driving.rest.saveUser.data;

public class SaveUserRequest {
	private String name;
	private String cpf;

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

}
