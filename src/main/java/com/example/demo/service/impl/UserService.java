package com.example.demo.service.impl;

import com.example.demo.dto.ResponseDto;
import com.example.demo.entity.User;



public interface UserService {
	
	User saveUser(User user);

    ResponseDto getUser(Long userId);

}
