package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Courses;

public interface CourseRepo extends JpaRepository<Courses, Integer> {

}
