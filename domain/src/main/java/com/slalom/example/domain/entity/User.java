package com.slalom.example.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class User {
	private String id;
	private String email;
	private String password;
	private String lastName;
	private String firstName;
}
