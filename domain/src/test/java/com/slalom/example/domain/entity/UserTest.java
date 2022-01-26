package com.slalom.example.domain.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void shouldBeBuiltWithProvidedData() {
		User user = User.builder()
			.firstName("Marcin")
			.build();
		Assertions.assertEquals("Marcin", user.getFirstName());
	}
}
