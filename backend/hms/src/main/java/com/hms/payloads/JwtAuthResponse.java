package com.hms.payloads;

import com.hms.payloads.JwtAuthResponse;

import lombok.Data;

@Data
public class JwtAuthResponse {

	private String token;
	private UserDto user;
}

