package br.com.hexagonal.demohexa.driving.rest.saveUser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hexagonal.demohexa.application.port.SaveUserUserCasePort;
import br.com.hexagonal.demohexa.domain.dto.SaveUserDto;
import br.com.hexagonal.demohexa.driving.rest.saveUser.data.SaveUserRequest;
import br.com.hexagonal.demohexa.driving.rest.saveUser.data.SaveUserResponse;

@RestController
public class SaveUserController {
	@Autowired
	private SaveUserUserCasePort saveUserUserCase;
	
	@PostMapping("/users")
	public ResponseEntity<SaveUserResponse> save(@RequestBody SaveUserRequest request) {
		var saveUserDto = new SaveUserDto(request.getName(), request.getCpf());
		
		var savedUser = this.saveUserUserCase.saveUser(saveUserDto);
		
		var response = new SaveUserResponse();
		response.setId(savedUser.getId());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	
}
