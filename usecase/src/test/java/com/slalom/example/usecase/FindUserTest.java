package com.slalom.example.usecase;

import com.slalom.example.domain.entity.User;
import com.slalom.example.usecase.port.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

@ExtendWith(MockitoExtension.class)
class FindUserTest {
	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private FindUser findUser;

	@Test
	void shouldFindUser() {
		var user = User.builder().firstName("Marcin").build();
		Mockito.when(userRepository.findAllUsers()).thenReturn(Collections.singletonList(user));
		Assertions.assertEquals(Collections.singletonList(user), findUser.findAllUsers());
	}

}
