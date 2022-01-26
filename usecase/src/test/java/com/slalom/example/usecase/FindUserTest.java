package com.slalom.example.usecase;

import com.slalom.example.domain.entity.User;
import com.slalom.example.usecase.port.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

class FindUserTest {

	@Test
	void shouldFindUser() {
		UserRepository userRepository = new UserRepository() {
			@Override
			public User create(User user) {
				return null;
			}

			@Override
			public Optional<User> findById(String id) {
				return Optional.empty();
			}

			@Override
			public Optional<User> findByEmail(String email) {
				return Optional.empty();
			}

			@Override
			public List<User> findAllUsers() {
				return Collections.emptyList();
			}
		};
		FindUser findUser = new FindUser(userRepository);
		Assertions.assertEquals(0, findUser.findAllUsers().size());
	}

}
