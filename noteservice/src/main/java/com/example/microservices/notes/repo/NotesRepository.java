package com.example.microservices.notes.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.microservices.notes.model.Notes;


//@Repository
public interface NotesRepository extends JpaRepository<Notes,Integer> {

	@Query("select n from Notes n where n.title=?1")
	public List<Notes> findByTitle(String title);

}
