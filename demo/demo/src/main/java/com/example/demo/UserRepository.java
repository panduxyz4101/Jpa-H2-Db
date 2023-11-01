//This is a repository interface that extends JpaRepository for the main User entity

package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
