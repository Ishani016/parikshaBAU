package com.pariksha.api.services;

import org.springframework.stereotype.Service;

import com.pariksha.api.dataModels.UserEntity;

@Service
public interface UserService {
	
	UserEntity addUser(UserEntity user);
}
