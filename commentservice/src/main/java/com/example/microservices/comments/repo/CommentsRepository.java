package com.example.microservices.comments.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.microservices.comments.model.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Integer> {	
	@Query("select u from Comments u where u.pid=?1")
	public List<Comments> searchCommentsByPid(int id);

}