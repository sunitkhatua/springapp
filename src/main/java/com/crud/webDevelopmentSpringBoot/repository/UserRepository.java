package com.crud.webDevelopmentSpringBoot.repository;

import com.crud.webDevelopmentSpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
