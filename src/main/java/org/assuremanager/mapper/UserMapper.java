package org.assuremanager.mapper;
import org.assuremanager.dto.request.UserRegisterRequest;
import org.assuremanager.dto.response.UserResponseDto;
import org.assuremanager.model.Role;
import org.assuremanager.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper {

    public User toEntity(UserRegisterRequest request) {
        return User.builder()
                .username(request.username())
                .password(request.password())
                .role(request.role() != null ? request.role() : Role.ROLE_USER)
                .build();
    }
}