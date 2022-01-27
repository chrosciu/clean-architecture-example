package com.slalom.example.controller;

import com.slalom.example.controller.model.UserWeb;
import com.slalom.example.domain.entity.User;
import com.slalom.example.usecase.CreateUser;
import com.slalom.example.usecase.FindUser;
import com.slalom.example.usecase.LoginUser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {
	@Mock
	private CreateUser createUser;

	@Mock
	private FindUser findUser;

	@Mock
	private LoginUser loginUser;

	@InjectMocks
	private UserController userController;

	@Test
	void test() {
		var user = User.builder().firstName("Marcin").build();
		var userWeb = UserWeb.toUserWeb(user);
		when(findUser.findAllUsers()).thenReturn(singletonList(user));
		assertThat(userController.allUsers()).containsExactly(userWeb);
	}
}
