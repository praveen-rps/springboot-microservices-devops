package com.example.microservices.comments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.microservices.comments.model.Comments;
import com.example.microservices.comments.repo.CommentsRepository;


@Service
public class CommentsServiceImpl implements CommentsService {
	
	
	@Autowired
	CommentsRepository repo;
	
	

	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Comments insertComments(Comments comments) {
		// TODO Auto-generated method stub
		return repo.save(comments);
	}

	@Override
	public String deleteComment(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "comment deleted..";
	}

	@Override
	public List<Comments> searchCommentsByPid(int pid) {
		// TODO Auto-generated method stub
		return repo.searchCommentsByPid(pid);
	}

}
