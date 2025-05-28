package com.restexample.resthalan.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository
        extends JpaRepository<student,Long> {
}
