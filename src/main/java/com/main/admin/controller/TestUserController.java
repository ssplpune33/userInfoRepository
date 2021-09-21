package com.main.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.admin.dto.AppResponse;
import com.main.admin.dto.TestUserPojo;
import com.main.admin.service.UserInfoService;


@RestController
@CrossOrigin
@RequestMapping("/testUser")
public class TestUserController {
	
	@Autowired
	UserInfoService service;
	
	
	@PostMapping(value = "/getUserInfo")
	public @ResponseBody ResponseEntity<Object> userInfo(@RequestBody TestUserPojo pojo) {
		AppResponse resp = new AppResponse();
		ResponseEntity<Object> responce = null;
		try {
			if(pojo.getActionFlag()!=null) {
				responce = service.getUserInfo(pojo);
			}else {
				resp.setMessage("Input Data Not Found In userInfo API");
				return ResponseEntity.badRequest().body(resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.setMessage("Exception In userInfo API - "+e);
			return ResponseEntity.unprocessableEntity().body(resp);
         }
		
		return responce;
	}
	

}
