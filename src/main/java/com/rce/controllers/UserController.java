package com.rce.controllers;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rce.dto.UserRequestDto;
import com.rce.dto.UserResponseDto;
import com.rce.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private  final UserService userService;
	
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@PostMapping("/singUp")
	public UserResponseDto signUp(@RequestBody UserRequestDto userRequestDto) {
		return userService.userSingup(userRequestDto);
	}
	
	@GetMapping
	public List<UserResponseDto> getAllData(){
		return userService.getAllUsers();
	}
	@GetMapping("getById/{id}")
   public UserResponseDto getNameById(@PathVariable  long id) {
	   return userService.getNameById(id);
   }
	
	public void  deleteUser(long id) {
		 userService.deleteUser(id); 
		}
	
		
	

}
