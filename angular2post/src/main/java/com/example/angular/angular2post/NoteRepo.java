package com.example.angular.angular2post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepo extends JpaRepository<Note,Integer>{

}
