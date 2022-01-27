package com.slalom.example.usecase;

import com.slalom.example.domain.entity.User;
import com.slalom.example.usecase.port.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FindUserTest {
	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private FindUser findUser;

	@Test
	void shouldFindUser() {
		var user = User.builder().firstName("Marcin").build();
		when(userRepository.findAllUsers()).thenReturn(singletonList(user));
		assertThat(findUser.findAllUsers()).containsExactly(user);
	}

}
