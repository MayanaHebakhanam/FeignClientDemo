package com.example.demo.controller;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.util.FeignUtil;


@RestController
@RequestMapping("/demo")
public class Controller {

	@Autowired
	private FeignUtil util;
	
	@GetMapping("/employee1")
	Iterable<Employee> readDetails() {
		return util.read();
	}

	@PutMapping("/employee1")
	Employee updateDetails(@RequestBody Employee e) {
		return util.update(e);
	}

	@ResponseBody
	@PostMapping("/employee1")
	Employee createEmployee(@Valid @RequestBody Employee e) {
		return util.create(e);
	}

	@DeleteMapping("/employee1/{id}")
	void deleteById(@PathVariable @Min(1) @Max(45) Integer id) {
		util.delete(id);
	}



}
