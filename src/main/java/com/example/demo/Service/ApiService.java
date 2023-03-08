package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Task;
import com.example.demo.Repositories.NewRepository;


@Service
public class ApiService {

	@Autowired
	NewRepository repository;
		public Optional<Task> gettaskdetail(int id){
			return repository.findById(id);
		}

		public String updateDetails(Task t) {
			repository.save(t);
			return "updated";
		}

		public String deleteDetails(int id) {
			repository.deleteById(id);
			return "Id deleted";
		}
}