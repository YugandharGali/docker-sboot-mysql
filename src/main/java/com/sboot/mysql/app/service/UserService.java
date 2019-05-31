package com.sboot.mysql.app.service;

import javax.validation.Valid;

import com.sboot.mysql.app.dto.UserDTO;
import com.sboot.mysql.app.dto.UserList;
import com.sboot.mysql.app.exception.AppException;

public interface UserService {

	public UserDTO createUser(@Valid UserDTO userDTO) throws AppException;

	public UserList getAllUsers() throws AppException;

	public UserDTO getUserById(long userid) throws AppException;

	public String updateUser(long userId, @Valid UserDTO userDTO) throws AppException;

	public String deleteUser(long userId) throws AppException;

}
