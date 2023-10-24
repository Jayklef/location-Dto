package com.jayklef.locationdto.repository;

import com.jayklef.locationdto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
