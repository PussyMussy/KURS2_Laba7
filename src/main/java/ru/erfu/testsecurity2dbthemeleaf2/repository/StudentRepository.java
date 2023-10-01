package ru.erfu.testsecurity2dbthemeleaf2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.erfu.testsecurity2dbthemeleaf2.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}