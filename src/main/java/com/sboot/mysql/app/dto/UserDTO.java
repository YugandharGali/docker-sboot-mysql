package com.sboot.mysql.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class UserDTO {
	
	private long userId;
	
	private String uname;
	
	private String address;
	
	private String email;
	
	private String phoneNo;
	
	
}
