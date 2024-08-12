package com.example.Auth_Security;

import com.example.Auth_Security.entities.Role;
import com.example.Auth_Security.entities.User;
import com.example.Auth_Security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.Auth_Security"})
public class AuthSecurityApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(AuthSecurityApplication.class, args);
	}

	public void run(String... args){

		User adminAccount = userRepository.findByRole(Role.ADMIN);

		if (null == adminAccount){
			User user = new User();

			user.setFirstName("Kamrul");
			user.setLastName("Hasan");
			user.setEmail("kamrulhasan08741@gmail.com");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("*Kamrul007#"));

			userRepository.save(user);
		}
	}

}
