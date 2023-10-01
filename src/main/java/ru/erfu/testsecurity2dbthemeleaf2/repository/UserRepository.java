package ru.erfu.testsecurity2dbthemeleaf2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.erfu.testsecurity2dbthemeleaf2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}