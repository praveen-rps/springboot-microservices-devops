package com.example.microservices.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.microservices.notes.model.CommentsDto;
import com.example.microservices.notes.model.Notes;
import com.example.microservices.notes.repo.NotesRepository;


@Service
public class NotesServiceImpl implements NotesService {
	
	@Autowired
	NotesRepository repo;
	
	@Autowired
	FeignProxy proxy;
	
	//@Autowired
	//CommentsProxy cproxy;
	
	@Autowired
	RestTemplate template;
	
	@Override
	public String getCommentsPort() {
		return proxy.getPort();
	}
	

	@Override
	public List<Notes> getAllNotes() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Notes insertNotes(Notes notes) {
		// TODO Auto-generated method stub
		return repo.save(notes);
	}

	@Override
	public String deleteNotes(int noteId) {
		// TODO Auto-generated method stub
		repo.deleteById(noteId);
		return "Record Deleted...";
	}

	@Override
	public List<Notes> searchNotesByTitle(String title) {
		// TODO Auto-generated method stub
		return repo.findByTitle(title);
	}

	@Override
	public List<CommentsDto> serachCommentsForPostId(int pid) {
		// TODO Auto-generated method stub
		
		//return template.getForObject("http://COMMENTSERVICE/comments/search/"+pid, List.class);
		return proxy.searchCommentsByPid(pid);
		
		//return cproxy.searchCommentsByPid(pid);

	}

}
