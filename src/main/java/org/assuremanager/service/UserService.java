    package org.assuremanager.service;


    import org.assuremanager.dto.request.UserRegisterRequest;

    import org.springframework.security.core.userdetails.UserDetails;
    import org.springframework.security.core.userdetails.UserDetailsService;


    public interface UserService extends UserDetailsService {
        UserDetails loadUserByUsername(String username);
        void register(UserRegisterRequest request);
    }