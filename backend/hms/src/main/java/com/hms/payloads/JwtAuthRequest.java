package com.hms.payloads;

import com.hms.payloads.JwtAuthRequest;

import lombok.Data;

@Data
public class JwtAuthRequest {

	private String username;
	
	private String password;
	
}
