package com.example.microservices.comments.service;

import java.util.List;

import com.example.microservices.comments.model.Comments;



public interface CommentsService {
	
	public List<Comments> getAllComments();
	public Comments insertComments(Comments comments);
	public String deleteComment(int cid);
	public List<Comments> searchCommentsByPid(int pid);


}
