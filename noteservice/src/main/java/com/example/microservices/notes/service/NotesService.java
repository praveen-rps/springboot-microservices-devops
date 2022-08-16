package com.example.microservices.notes.service;

import java.util.List;

import com.example.microservices.notes.model.CommentsDto;
import com.example.microservices.notes.model.Notes;



public interface NotesService {
	
	public List<Notes> getAllNotes();
	public Notes insertNotes(Notes notes);
	public String deleteNotes(int noteId);
	public List<Notes> searchNotesByTitle(String title);
	public String getCommentsPort();
	public List<CommentsDto> serachCommentsForPostId(int pid);

}
