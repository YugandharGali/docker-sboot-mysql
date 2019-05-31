package com.sboot.mysql.app.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sboot.mysql.app.entity.UserDO;

public interface UserRepository
		extends JpaRepository<UserDO, Long>, JpaSpecificationExecutor<UserDO>, Serializable {


}
