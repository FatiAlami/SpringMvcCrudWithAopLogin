package com.master4.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.master4.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Page<User> findAll(Pageable pageable);
    
    @Query("SELECT u FROM User u WHERE u.email=:email AND u.password=:password")
    User login(@Param("email") String email, @Param("password") String password);
}
