package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ContactsController {

	@Autowired
	ContactRepository repository;

	@GetMapping("/contacts")
	public String getContacts(Model model) {
		Iterable<Contact> contacts = repository.findAll();
		model.addAttribute("contactList", contacts);
		return "contact";
	}

	@PostMapping("/save")
	public void insert(@RequestBody Contact contact) {
		repository.save(contact);

	}

	@DeleteMapping("/delete/{id}")
	public void insert(@PathVariable int id) {
		repository.deleteById(id);

	}

}
