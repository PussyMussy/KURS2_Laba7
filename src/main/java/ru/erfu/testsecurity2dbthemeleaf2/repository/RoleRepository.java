package ru.erfu.testsecurity2dbthemeleaf2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.erfu.testsecurity2dbthemeleaf2.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
