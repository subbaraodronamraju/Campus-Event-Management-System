package com.rce.services;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.rce.dao.UserRepository;
import com.rce.dto.UserRequestDto;
import com.rce.dto.UserResponseDto;
import com.rce.exceptions.NameNotFound;
import com.rce.models.User;

@Service
public class UserServiceImpl implements UserService {
	
	private  final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public UserResponseDto userSingup(UserRequestDto userRequestDto) {
		User user= new User();
		user.setUserName(userRequestDto.getUserName());
		user.setEmail(userRequestDto.getEmail());
		user.setPassword(userRequestDto.getPassword());
		user.setBranch(userRequestDto.getBranch());
		user.setRole(userRequestDto.getRole());
		user.setYearOfStudy(userRequestDto.getYearOfStudy());
		user.setInterests(userRequestDto.getInterests());
		User savedUser = userRepository.save(user);
		UserResponseDto userResponseDto = buildUserResponseDto(savedUser);
		 return userResponseDto;
		 }


	@Override
	public List<UserResponseDto> getAllUsers() {
	List<UserResponseDto> responseList = new ArrayList<UserResponseDto>();
	List<User> allUsers = userRepository.findAll();
	for(User users:allUsers) {
	UserResponseDto userResponseDto = buildUserResponseDto(users);
	responseList.add(userResponseDto);
		
		}
	return responseList;
		
		
	}
	@Override
	public UserResponseDto getNameById(long id) {
	User savedUser = userRepository.findById(id)
			               .orElseThrow(() -> new NameNotFound("Given Id Name is Not Found"+id));
	return buildUserResponseDto(savedUser) ;
	}
	
	@Override
	public void deleteUser(long id) {
	
		
	}

	private UserResponseDto buildUserResponseDto(User savedUser) {
		UserResponseDto userResponseDto = new UserResponseDto();
		userResponseDto.setUserName(savedUser.getUserName());
		userResponseDto.setEmail(savedUser.getEmail());
		userResponseDto.setBranch(savedUser.getBranch());
		userResponseDto.setRole(savedUser.getRole());
		userResponseDto.setYearOfStudy(savedUser.getYearOfStudy());
		userResponseDto.setInterests(savedUser.getInterests());
		return userResponseDto;
	}



}
