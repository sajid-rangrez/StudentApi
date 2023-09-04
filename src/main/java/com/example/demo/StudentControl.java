package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import com.example.demo.dao.StudentRepo;
import com.example.demo.data.Student;

@RestController
public class StudentControl {
	
	@Autowired
	StudentRepo repo;
//
//	@RequestMapping("/Home")
//	public String home(){
//		System.out.println("home called");
//		return "home.html";
//	}
//	
//	@RequestMapping("/addStudent")
//	public String addStudent(Student student) {
//		System.out.println("add students called");
//		
//		repo.save(student); 
//		return "home.html";
//	}
//	
	@PostMapping("/students")
	public String addStudents(@RequestBody List<Student> student) {
		System.out.println("add students called");
		try{
			repo.saveAll(student);
		} catch(Exception e){
			System.out.println("exception catched");
			return "Something wrong check json and try again!";
		}
		return "All students Added";
		 
	}
	
//	@RequestMapping("/getStudent")
//	public ModelAndView getStudent(@RequestParam int id) {
//		System.out.println("getStudent Called");
//		
//		ModelAndView mv = new ModelAndView("Student.jsp");
//		Student student = repo.findById(id).orElse(new Student());
//		
//		System.out.println(repo.findByTech("java"));
////		System.out.println(repo.findByTechSorted("java"));  //notWoorking
////		System.out.println(repo.findByIdGreaterThan(2)); //working
////		System.out.println(repo.findByIdLessThan(2));		//working
//		mv.addObject(student);
//		return mv;
//	}
	
	@GetMapping("/students")
	@ResponseBody
	public List<Student> getStudents() {
		return repo.findAll();
	}
	//add only one element at once Some error is occuring
	
	@GetMapping("/searchId/{Id}")
	public Optional<Student> getById(@PathVariable("Id") int id) { //pathVariable is assigning {Id} value to int Id
//		System.out.println(repo.findByName("Sajid").toString());
		return repo.findById(id);
	}
	
	@GetMapping("/searchTech/{un}")
	public List<Student> getByTech(@PathVariable("un") String un) { 
		return repo.findByTech(un);
	}
	
	@GetMapping("/searchName/{name}")
	public List<Student> getByName(@PathVariable("name") String un) {
		return repo.findByName(un);
	}

	@DeleteMapping("delete/{id}")
	public String deleteById(@PathVariable("id") int id) {
		repo.deleteById(id);
		return "object deleted";
	}
	
}