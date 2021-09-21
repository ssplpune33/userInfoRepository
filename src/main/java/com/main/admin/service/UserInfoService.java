package com.main.admin.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.main.admin.dto.TestUserPojo;


public interface UserInfoService {
	
	public ResponseEntity<Object> getUserInfo(TestUserPojo pojo);

}
