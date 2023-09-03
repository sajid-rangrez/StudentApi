package com.example.demo.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.data.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	List<Student> findByTech(String tech);
	List<Student> findByName(String name);
//	List<Student> findByIdGreaterThan(int id);
//	List<Student> findByIdLessThan(int id);
	
//	@Query("from student where tech=?1 order by name") //not working
//	List<Student> findByTechSorted(String tech);
}
