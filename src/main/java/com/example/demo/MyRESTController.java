package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRESTController {

	@Autowired
	ContactRepository repository;

	@GetMapping("/contacts")
	public Iterable<Contact> getContacts() {
		return repository.findAll();
	}

//	@PostMapping("/save")
//	public ResponseEntity<String> insert(@RequestBody Contact contact) {
//		repository.save(contact);
//		return new ResponseEntity<String>("Created", HttpStatus.OK);
//
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<String> insert(@PathVariable int id) {
//		repository.deleteById(id);
//		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
//
//	}

}
