package me.taxijjang.jwttutorial.repository;

import me.taxijjang.jwttutorial.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UseRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = "authorities")
    Optional<User> FindOneWithAuthoritiesByUsername(String username);
}
