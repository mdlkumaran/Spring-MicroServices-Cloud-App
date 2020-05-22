package com.mdlkumaran.photoapp.api.users.data;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<UserEntity, Long> {
	UserEntity findByEmail(String Email);
	UserEntity findByUserId(String userId);
}
