package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ContactsController {

	@Autowired
	ContactRepository repository;

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String getContacts(Model model) {
		Iterable<Contact> contacts = repository.findAll();
		model.addAttribute("contactList", contacts);
		return "contact";
	}

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String getSavePage(Model model) {
		return "savecontact";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void insert(Contact contact) {
		repository.save(contact);

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public void insert(@PathVariable int id) {
		repository.deleteById(id);

	}

}
