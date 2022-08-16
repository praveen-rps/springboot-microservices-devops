package com.example.microservices.comments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.comments.model.Comments;
import com.example.microservices.comments.service.CommentsService;


@RestController
@RequestMapping("/comments")
public class CommnetsController {
	
	@Autowired
	CommentsService service;
	

	@Value("${server.port}")
	public String port;
	
	@GetMapping("/port")
	public String getPort() {
		return "Application is running on port: "+port;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Comments>> displayAll(){

		return new ResponseEntity<>(service.getAllComments(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Comments> saveNotes(Comments comments){
		return new ResponseEntity<>(service.insertComments(comments), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{cid}")
	public ResponseEntity<String> deleteNotes(@PathVariable("cid")int cid){
		return new ResponseEntity(service.deleteComment(cid), HttpStatus.OK);
	}
	
	@GetMapping("/search/{pid}")
	public ResponseEntity<List<Comments>> searchCommentsByPid(@PathVariable("pid") int pid){
		return new ResponseEntity<>(service.searchCommentsByPid(pid), HttpStatus.OK);
	}
	
	

}
