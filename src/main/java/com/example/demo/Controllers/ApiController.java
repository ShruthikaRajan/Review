package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ApiService;
import com.example.demo.Model.Task;
import com.example.demo.Repositories.NewRepository;

@RestController
@CrossOrigin
public class ApiController {

	@Autowired
	  NewRepository serviceRepository;
	@Autowired
	   ApiService service;
	 
	 @GetMapping("/get")
	   List<Task> getList(){
		 return serviceRepository.findAll();
	 }
	 @PostMapping("/post")
	  public Task create(@RequestBody Task t) {
		 return serviceRepository.save(t);
	 }
	 
	 @GetMapping("/getvalues/{id}")
	 public Optional<Task> getbyid(@PathVariable int id){
		
		return service.gettaskdetail(id);
	 }
	 
	 @PutMapping("/put")
	 public String update(@RequestBody Task t) {
		 return service.updateDetails(t);
	 }
	 @DeleteMapping("/del/{id}")
		public String delete(@PathVariable int  id)
		{
			return service.deleteDetails(id);	

		}
	}
	
	 
	 
