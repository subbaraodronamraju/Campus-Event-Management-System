package com.rce.services;

import java.util.List;

import com.rce.dto.UserRequestDto;
import com.rce.dto.UserResponseDto;

public interface UserService {

	UserResponseDto userSingup(UserRequestDto userRequestDto);

	List<UserResponseDto> getAllUsers();
    
	

}
