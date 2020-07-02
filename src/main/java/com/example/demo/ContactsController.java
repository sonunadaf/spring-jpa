package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ContactsController {

	@Autowired
	ContactRepository repository;

	@PostMapping("/save")
	public String insert(@RequestBody Contact contact) {
		repository.save(contact);
		return "created";

	}

	@DeleteMapping("/delete/{id}")
	public String insert(@PathVariable int id) {
		repository.deleteById(id);
		return "deleted";

	}

}
