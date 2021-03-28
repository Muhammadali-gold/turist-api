package com.zero.turist.repository;

import com.zero.turist.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userrepository")
public interface UserRepository extends JpaRepository<User,Long> {
     User findByEmail(String email);
}
