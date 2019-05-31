package com.sboot.mysql.app.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.sboot.mysql.app.dto.UserDTO;
import com.sboot.mysql.app.dto.UserList;
import com.sboot.mysql.app.entity.UserDO;
import com.sboot.mysql.app.exception.AppException;
import com.sboot.mysql.app.mapper.UserMapper;
import com.sboot.mysql.app.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDTO createUser(@Valid UserDTO userDTO) throws AppException {
		UserDO userDo = userRepository.save(userMapper.toDO(userDTO));
		return userMapper.toDTO(userDo);
	}

	@Override
	public UserList getAllUsers() throws AppException {
		List<UserDO> userDoList = userRepository.findAll();
		return userMapper.toDTOList(userDoList);
	}

	@Override
	public UserDTO getUserById(long userId) throws AppException {
		Optional<UserDO> userDo = userRepository.findById(userId);
		if (!userDo.isPresent()) {
			throw new AppException("Entity Not Found");
		} else {
			return userMapper.toDTO(userDo.get());
		}
	}

	@Override
	public String updateUser(long userId, @Valid UserDTO userDTO) throws AppException {
		Optional<UserDO> userDo = userRepository.findById(userId);
		if (!userDo.isPresent()) {
			throw new AppException("Entity Not Found");
		} else {
			UserDO userDO = userDo.get();
			if (!StringUtils.isEmpty(userDTO.getUname())) {
				userDO.setUname(userDTO.getUname());
			}
			if (!StringUtils.isEmpty(userDTO.getAddress())) {
				userDO.setAddress(userDTO.getAddress());
			}
			if (!StringUtils.isEmpty(userDTO.getEmail())) {
				userDO.setEmail(userDTO.getEmail());
			}
			if (!StringUtils.isEmpty(userDTO.getPhoneNo())) {
				userDO.setPhoneNo(userDTO.getPhoneNo());
			}
			userRepository.save(userDO);
		}
		return "Update Success";
	}

	@Override
	public String deleteUser(long userId) throws AppException {
		Optional<UserDO> userDo = userRepository.findById(userId);
		if (!userDo.isPresent()) {
			throw new AppException("Entity Not Found");
		} else {
			userRepository.deleteById(userId);
		}
		return "Delete Success";
	}

}
