package com.example.minor_project_1.repositries;

import com.example.minor_project_1.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
