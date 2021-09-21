package com.main.admin.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.main.admin.dto.AppResponse;
import com.main.admin.dto.TestUserPojo;
import com.main.admin.entities.UserInfo;
import com.main.admin.repository.UserInfoRepository;


@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	UserInfoRepository userInfoRepository;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public ResponseEntity<Object> getUserInfo(TestUserPojo pojo) {
	
		AppResponse resp = new AppResponse();
		List<TestUserPojo> userList = new ArrayList<TestUserPojo>();
		TestUserPojo userPojo = new TestUserPojo();
		ResponseEntity<Object> responce = null;
		try {
			
			if(pojo.getActionFlag().equalsIgnoreCase("A")) {
				UserInfo userInfo = new UserInfo();
				
				if(pojo.getFirstName()!=null) {
					userInfo.setFirstName(pojo.getFirstName());
				}
				if(pojo.getLastName()!=null) {
					userInfo.setLastName(pojo.getLastName());
				}
				if(pojo.getMobileNumber()!=null) {
					userInfo.setMobileNumber(pojo.getMobileNumber());
				}
				if(pojo.getCity()!=null) {
					userInfo.setCity(pojo.getCity());
				}
				if(pojo.getDob()!=null) {
					userInfo.setDob(pojo.getDob());
				}
				userInfo.setCreatedDate(LocalDate.now());
				userInfo.setCreatedTime(LocalTime.now());
				userInfo.setStatus("A");
				userInfoRepository.save(userInfo);
				resp.setMessage("User Add Successfuly");
				return ResponseEntity.ok().body(resp);
				
			}else if(pojo.getActionFlag().equalsIgnoreCase("E")) {
				if(pojo.getId()!=null) {
					Optional<UserInfo> userObj = userInfoRepository.findById(pojo.getId());
					if(userObj.isPresent()) {
						userPojo.setFirstName(userObj.get().getFirstName());
						userPojo.setLastName(userObj.get().getLastName());
						userPojo.setMobileNumber(userObj.get().getMobileNumber());
						userPojo.setCity(userObj.get().getCity());
						if(userObj.get().getDob()!=null) {
//							String sDate = sdf.format(userObj.get().getDob());
//							Date dob = sdf.parse(sDate);
//							userPojo.setDob(dob);
							userPojo.setDob(userObj.get().getDob());
						}
						userPojo.setId(userObj.get().getId());
						return ResponseEntity.ok().body(userPojo);
					}else {
						resp.setMessage("Data Not found");
						return ResponseEntity.badRequest().body(resp);
					}
				}else {
					resp.setMessage("Input Id Not found");
					return ResponseEntity.badRequest().body(resp);
				}
			}else if(pojo.getActionFlag().equalsIgnoreCase("U")) {
				if(pojo.getId()!=null) {
					Optional<UserInfo> userObj = userInfoRepository.findById(pojo.getId());
					if(userObj.isPresent()) {
						UserInfo userInfo = userObj.get();
						
						if(pojo.getFirstName()!=null) {
							userInfo.setFirstName(pojo.getFirstName());
						}
						if(pojo.getLastName()!=null) {
							userInfo.setLastName(pojo.getLastName());
						}
						if(pojo.getMobileNumber()!=null) {
							userInfo.setMobileNumber(pojo.getMobileNumber());
						}
						if(pojo.getCity()!=null) {
							userInfo.setCity(pojo.getCity());
						}
						if(pojo.getDob()!=null) {
							userInfo.setDob(pojo.getDob());
						}
						userInfo.setUpdatedDate(LocalDate.now());
						userInfo.setUpdatedTime(LocalTime.now());
						userInfo.setStatus("A");
						userInfoRepository.save(userInfo);
						resp.setMessage("User Updated Successfuly");
						return ResponseEntity.ok().body(resp);
					}else {
						resp.setMessage("Data Not found");
						return ResponseEntity.badRequest().body(resp);
					}
				}else {
					resp.setMessage("Input Id Not found");
					return ResponseEntity.badRequest().body(resp);
				}
			}else if(pojo.getActionFlag().equalsIgnoreCase("D")) {
				if(pojo.getId()!=null) {
					Optional<UserInfo> userObj = userInfoRepository.findById(pojo.getId());
					if(userObj.isPresent()) {
						UserInfo userInfo = userObj.get();
						userInfo.setStatus("D");
						userInfo.setUpdatedDate(LocalDate.now());
						userInfo.setUpdatedTime(LocalTime.now());
						userInfoRepository.save(userInfo);
						resp.setMessage("User Deleted Successfuly");
						return ResponseEntity.ok().body(resp);
					}else {
						resp.setMessage("Input Id Not found");
						return ResponseEntity.badRequest().body(resp);
					}
				}else {
					resp.setMessage("Input Id Not found");
					return ResponseEntity.badRequest().body(resp);
				}
			}else if(pojo.getActionFlag().equalsIgnoreCase("L")) {
				
					List<UserInfo> usersList = userInfoRepository.findByStatus("A");
					
					userList = usersList.stream().map(u->new TestUserPojo(u.getId(),u.getFirstName(),u.getLastName(),u.getDob(),u.getMobileNumber(),u.getCity())).collect(Collectors.toList());
					
					if(!usersList.isEmpty()) {
//						for (UserInfo userInfo : usersList) {
//							TestUserPojo user = new TestUserPojo();
//							user.setFirstName(userInfo.getFirstName());
//							user.setLastName(userInfo.getLastName());
//							user.setMobileNumber(userInfo.getMobileNumber());
//							user.setCity(userInfo.getCity());
//							if(userInfo.getDob()!=null) {
//								Date dob = sdf.parse(sdf.format(userInfo.getDob()));
//								user.setDob(userInfo.getDob());
//							}
//							user.setId(userInfo.getId());
//							userList.add(user);
//						}
						return ResponseEntity.ok().body(userList);
					}else {
						resp.setMessage("Data Not found");
						return ResponseEntity.badRequest().body(resp);
					}
			}
			
		} catch (Exception e) {
			System.out.println("Exceptiuon is "+e);
		}
		
		return ResponseEntity.ok().body(responce);
		
	}
	
	

}
