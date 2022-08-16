package com.example.microservices.notes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.notes.model.CommentsDto;
import com.example.microservices.notes.model.Notes;
import com.example.microservices.notes.service.NotesService;

@RestController
@RequestMapping("/notes")
public class NotesController {
	
	@Autowired
	NotesService service;
	
	@GetMapping("/getCommentsPort")
	public String getPort() {
		return service.getCommentsPort();
	}
	
	@GetMapping("/search/comments/{pid}")
	public ResponseEntity<List<CommentsDto>> searchCommentsByPid(@PathVariable("pid")int pid){
		return new ResponseEntity<>(service.serachCommentsForPostId(pid) ,HttpStatus.OK);
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Notes>> displayAll(){
		
		return new ResponseEntity<>(service.getAllNotes(), HttpStatus.OK);
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<Notes> saveNotes(Notes notes){
		return new ResponseEntity<>(service.insertNotes(notes), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{noteId}")
	public ResponseEntity<String> deleteNotes(@PathVariable("noteId")int noteId){
		return new ResponseEntity(service.deleteNotes(noteId), HttpStatus.OK);
	}
	
	@GetMapping("/search/{title}")
	public ResponseEntity<List<Notes>> searchNotesByTitle(@PathVariable("title") String title){
		return new ResponseEntity<>(service.searchNotesByTitle(title), HttpStatus.OK);
	}

}
