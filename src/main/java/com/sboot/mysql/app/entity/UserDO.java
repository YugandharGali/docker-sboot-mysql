package com.sboot.mysql.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class UserDO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userid;

	@Column(name = "uname")
	private String uname;

	@Column(name = "address")
	private String address;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_no")
	private String phoneNo;

}
