package com.example.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "under_graduate")
public class Undergraduate extends Person {

	@Id
	private String Id;
	private String Degree;
	private String University;
	
	@ManyToMany
	@JoinTable(name = "under_graduate_sessions",
	joinColumns = @JoinColumn(name = "under_graduates_id" ),
	inverseJoinColumns = @JoinColumn(name ="sessions_id"))
	private List<Session> sessions;
	
	public Undergraduate() {
		
	}

	public Undergraduate(String id, String degree, String university, List<Session> sessions) {
		super();
		Id = id;
		Degree = degree;
		University = university;
		this.sessions = sessions;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}

	public String getUniversity() {
		return University;
	}

	public void setUniversity(String university) {
		University = university;
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
	
	
}
