package com.iw.pract1c.components;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import com.iw.pract1c.models.User;
import com.iw.pract1c.repositories.UserRepository;

public class DatabaseLoader {
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	private void initDatabase() {
        userRepository.save(new User("a1","root", "root", "ADMIN"));
        userRepository.save(new User("u1","user", "password", "VIEWER"));
	}
}