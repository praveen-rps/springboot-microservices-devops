package com.example.microservices.notes.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.microservices.notes.model.CommentsDto;

@FeignClient("commentservice")
public interface FeignProxy {
	
	@GetMapping("comments/search/{pid}")
	public List<CommentsDto> searchCommentsByPid(@PathVariable("pid") int  pid);
	
	@GetMapping("comments/port")
	public String getPort();
	
	
}
