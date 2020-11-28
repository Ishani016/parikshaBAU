package com.pariksha.api.services;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pariksha.api.dataModels.UserEntity;
import com.pariksha.api.repositories.UserRepository;

public class UserServiceImplementation implements UserService {

private Logger logger = LoggerFactory.getLogger(Logger.class);
	
	@Autowired
	UserRepository userRepo;
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public UserEntity addUser(UserEntity user) {
		try {
			Random random = new Random();Integer id = random.nextInt(100000000);
			user.setUserId(id);
//			user.setPassword(passwordEncoder.encode(user.getPassword()));
			userRepo.save(user);
			logger.info(user.getUserName() + "added successfully");
			return user;
		} catch(Exception e) {
			logger.error("Error occurred while adding user "+ user.getUserName());
			e.printStackTrace();
		}
		return null;
	}

}
