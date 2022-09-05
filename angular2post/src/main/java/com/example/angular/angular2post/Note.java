package com.example.angular.angular2post;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Note {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int pid;
	
	@Column
	String title;
	
	
	@Column
	String author;


	public int getPid() {
		return pid;
	}


	public void setId(int pid) {
		this.pid = pid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Note(int id, String title, String author) {
		super();
		this.pid = pid;
		this.title = title;
		this.author = author;
	}
	
	public Note() {
		
	}
	

}
