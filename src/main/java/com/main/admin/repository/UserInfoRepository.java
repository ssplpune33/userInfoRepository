package com.main.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.admin.entities.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

	List<UserInfo> findByStatus(String status);
	
}
