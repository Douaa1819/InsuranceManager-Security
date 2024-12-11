    package org.assuremanager.service;

    import org.assuremanager.dto.request.UserLoginRequest;
    import org.assuremanager.dto.request.UserRegisterRequest;
    import org.assuremanager.dto.response.UserResponseDto;
    import org.assuremanager.model.User;
    import org.springframework.security.core.userdetails.UserDetails;
    import org.springframework.security.core.userdetails.UserDetailsService;
    import org.springframework.stereotype.Service;

    @Service
    public interface UserService extends UserDetailsService {
        boolean isEmailExists(String email);
        User getUserByEmail(String email);
        UserDetails loadUserByUsername(String username);
        void register(UserRegisterRequest request);
    }