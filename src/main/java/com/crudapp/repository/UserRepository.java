package com.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapp.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom JPQL query to search users by name
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> searchByName(@Param("name") String name);
}
