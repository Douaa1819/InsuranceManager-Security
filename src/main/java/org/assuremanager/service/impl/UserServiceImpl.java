package org.assuremanager.service.impl;

import jakarta.transaction.Transactional;
import org.assuremanager.model.Role;
import org.assuremanager.model.User;
import org.assuremanager.repository.UserRepository;
import org.assuremanager.dto.request.UserRegisterRequest;
import org.assuremanager.mapper.UserMapper;
import org.assuremanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Transactional
@Service("userDetailsServiceImpl")
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }
    @Override
    public void register(UserRegisterRequest request) {

        User user = userMapper.toEntity(request);
        user.setPassword(passwordEncoder.encode(request.password()));

//
//        if (user.getRole() == null) {
//            user.setRole(Role.ROLE_USER);
//        }
//if(user.getUsername()==null){
//    user.setUsername("test");
//
//}

        userRepository.save(user);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .map(user -> org.springframework.security.core.userdetails.User.builder()
                        .username(user.getUsername())
                        .password(user.getPassword())
                        .roles(user.getRole().name())
                        .build())
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
    }
}

