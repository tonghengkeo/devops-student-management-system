package com.keotongheng.dsms.student.repository;

import com.keotongheng.dsms.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByStudentCode(String studentCode);

    boolean existsByStudentCode(String studentCode);

    boolean existsByEmail(String email);
}