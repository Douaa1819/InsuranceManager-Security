package org.assuremanager.config;


import org.assuremanager.mapper.UserMapper;
import org.assuremanager.repository.UserRepository;
import org.assuremanager.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "org.assuremanager")
@EnableWebMvc
@Import({WebConfig.class, JpaConfig.class})
public class AppInitializer {
    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepository, PasswordEncoder passwordEncoder, UserMapper userMapper) {
        return new UserServiceImpl(userRepository, passwordEncoder, userMapper);
    }

}
