package com.example.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "post_graduate")
public class Postgraduate extends Person{

	@Id
	private String Id;
	
	private String Institude;
	@Column(name = "research_interest")
	private String ResearchInterest;
	@Column(name = "second_degree")
	private String SecondDegree;
	
	@ManyToMany
	@JoinTable(name = "post_graduate_sessions",
	joinColumns = @JoinColumn(name = "post_graduates_id"),
	inverseJoinColumns = @JoinColumn(name = "sessions_id"))
	private List<Session> sessions;

	public  Postgraduate() {
		
	}
	public Postgraduate(String id, String institude, String researchInterest, String secondDegree,
			List<Session> sessions) {
		super();
		Id = id;
		Institude = institude;
		ResearchInterest = researchInterest;
		SecondDegree = secondDegree;
		this.sessions = sessions;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getInstitude() {
		return Institude;
	}

	public void setInstitude(String institude) {
		Institude = institude;
	}

	public String getResearchInterest() {
		return ResearchInterest;
	}

	public void setResearchInterest(String researchInterest) {
		ResearchInterest = researchInterest;
	}

	public String getSecondDegree() {
		return SecondDegree;
	}

	public void setSecondDegree(String secondDegree) {
		SecondDegree = secondDegree;
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
	
	
}
