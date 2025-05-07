package com.example.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "presenter")
public class Presenter extends Person{
	
	@Id
	private String Id;
	
	private String Affiliation;
	private String Country;
	@Column(name = "job_title")
	private String JobTitle;
	
	@ManyToMany(mappedBy = "presenters")
	private List<Session> sessions;
	
	public Presenter() {
		
	}

	public Presenter(String id, String affiliation, String country, String jobTitle, List<Session> sessions) {
		super();
		Id = id;
		Affiliation = affiliation;
		Country = country;
		JobTitle = jobTitle;
		this.sessions = sessions;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getAffiliation() {
		return Affiliation;
	}

	public void setAffiliation(String affiliation) {
		Affiliation = affiliation;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
	
}
