package com.example.demo.util;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Employee;

//@FeignClient(value="feigndemo",url="http:localhost:8080/main")
public interface FeignUtil {

	@GetMapping("/employee")
	Iterable<Employee> read();
	
	@PutMapping("/employee")
	Employee update(@RequestBody Employee e);
	
	@PostMapping("/employee")
	Employee create(@Valid @RequestBody Employee e);
	
	@DeleteMapping("/employee/{id}")
	void delete(@PathVariable @Min(1) @Max(45) Integer id);
	

}
