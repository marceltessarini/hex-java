package br.com.hexagonal.demohexa.driven.adapter.event.user.message;

import java.util.UUID;

public record ApproveUserMessage(UUID id, String name, String cpf) {

}
