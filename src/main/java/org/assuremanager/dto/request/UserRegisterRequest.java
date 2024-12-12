package org.assuremanager.dto.request;

import jakarta.validation.constraints.NotBlank;
import org.assuremanager.model.Role;


public record UserRegisterRequest(
        @NotBlank(message = "Username cannot be blank")
        String username,

        @NotBlank(message = "Password cannot be blank")
        String password,

        Role role
)
{}