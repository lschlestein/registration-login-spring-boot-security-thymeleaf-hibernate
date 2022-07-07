package springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import springboot.model.User;
import springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
