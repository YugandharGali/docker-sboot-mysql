package com.sboot.mysql.app.mapper;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;

import com.sboot.mysql.app.dto.UserDTO;
import com.sboot.mysql.app.dto.UserList;
import com.sboot.mysql.app.entity.UserDO;

@Component
public class UserMapper {

	public UserDO toDO(@Valid UserDTO userDTO) {
		UserDO userDO = new UserDO();
		userDO.setUname(userDTO.getUname());
		userDO.setAddress(userDTO.getAddress());
		userDO.setEmail(userDTO.getEmail());
		userDO.setPhoneNo(userDTO.getPhoneNo());
		return userDO;
	}

	public UserDTO toDTO(UserDO userDO) {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(userDO.getUserid());
		userDTO.setUname(userDO.getUname());
		userDTO.setAddress(userDO.getAddress());
		userDTO.setEmail(userDO.getEmail());
		userDTO.setPhoneNo(userDO.getPhoneNo());
		return userDTO;
	}

	public UserList toDTOList(List<UserDO> userDoList) {
		UserList userList = new UserList();
		List<UserDTO> userDtoList = new ArrayList<>();
		if (!userDoList.isEmpty()) {
			for (UserDO userDO : userDoList) {
				userDtoList.add(toDTO(userDO));
			}
		}
		userList.setUserList(userDtoList);
		return userList;
	}

}
