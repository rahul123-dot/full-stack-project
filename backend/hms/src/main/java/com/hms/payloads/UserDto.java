package com.hms.payloads;

import java.util.HashSet;
import java.util.Set;

import com.hms.payloads.RoleDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {
	private int id;
	private String fname;
	private String lname;
	private String mob;
	private String idp;
	private String email;
	private String password;
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();
}
