package com.mbanking.app.userInfo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbanking.app.userInfo.models.User;
import com.mbanking.app.userInfo.models.UserAuthRestRequest;
import com.mbanking.app.userInfo.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
		
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User findUserByAccNumber(String id) {
		return userRepository.findUserByAccNumber(id);
	}
	
	public User findUser(UserAuthRestRequest userReq) {
		User result = userRepository.findUser(userReq.getAccountNumber(), userReq.getPassword());
		if(result == null) {
			return null;
		}
		return result;
	}
	
	public User findUserInfo(UserAuthRestRequest userReq) {
		User result = userRepository.findUserInfo(userReq.getAccountNumber());
		if(result == null) {
			return null;
		}
		return result;
	}
}
