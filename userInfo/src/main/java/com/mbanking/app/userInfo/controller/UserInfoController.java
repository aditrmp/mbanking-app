package com.mbanking.app.userInfo.controller;

import java.net.URISyntaxException;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mbanking.app.userInfo.models.User;
import com.mbanking.app.userInfo.models.UserAuthRestRequest;
import com.mbanking.app.userInfo.models.UserInfoResp;
import com.mbanking.app.userInfo.services.UserService;

@RestController
@RequestMapping("/userinfo")
@CrossOrigin(origins="http://localhost:7777")  
public class UserInfoController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getuserinfo", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> getAuth(@RequestBody UserAuthRestRequest req) throws URISyntaxException {
		try {
			if(req != null) {
				User user = userService.findUserInfo(req);
				if(user != null) {
					return new ResponseEntity<>(
							new UserInfoResp(user.getAccountNumber(), user.getFirstName(), user.getLastName()), HttpStatus.OK);
				}else {
					return new ResponseEntity<>(
							new UserInfoResp("", "", ""), HttpStatus.OK);
				}
			}else {
				return new ResponseEntity<>(
						"Request is null", HttpStatus.OK);
			}
			
			
		} catch (HibernateException e) {
			System.out.println(e);
			return new ResponseEntity<>(
					"Error", HttpStatus.CONFLICT);
		}
	}
}
