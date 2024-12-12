package org.assuremanager.mapper;
import org.assuremanager.dto.request.UserRegisterRequest;
import org.assuremanager.dto.response.UserResponseDto;
import org.assuremanager.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    @Mapping(target = "role", constant = "ROLE_USER")
    User toEntity(UserRegisterRequest dto);

    UserResponseDto toDto(User entity);

}