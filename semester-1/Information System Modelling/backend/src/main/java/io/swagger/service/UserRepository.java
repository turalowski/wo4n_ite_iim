package io.swagger.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	@Modifying
	@Query("update User u set u.fullName = ?1, u.companyName = ?2 where u.email = ?3")
	void updateUserById(String fullName, String companyName, String email);
}
