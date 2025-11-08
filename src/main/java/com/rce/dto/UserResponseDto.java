package com.rce.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
  
	   private long userId;
	
	   private String userName;
	   
	   private String email;
	   
	   private String branch;
	   
	   private String role;
	   
	   private String yearOfStudy;
	   
	   private String interests;
	   
	  
}
