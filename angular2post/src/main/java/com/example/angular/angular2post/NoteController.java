package com.example.angular.angular2post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
@RequestMapping("/posts")
@CrossOrigin("*")
public class NoteController {
	
	@Autowired
	NoteService service;
	
	
	@GetMapping("/show")
	public List<Note> findAllNotes(){
		return service.findAll();
	}
	
	@PostMapping("/add")
	public Note addNote(@RequestBody Note note) {
		return service.addPost(note);
	}
	
	
	

}
