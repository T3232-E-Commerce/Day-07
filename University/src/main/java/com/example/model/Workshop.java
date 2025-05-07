package com.example.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "workshop")
public class Workshop {
	
	@Id
	private String Id;
	private String Description;
	private Date EndDate;
	private String Name;
	private Date StartDate;
	
	@OneToMany(mappedBy="workshop")
	private List<Session> sessions;
	
	public Workshop() {
		
	}

	public Workshop(String id, String description, Date endDate, String name, Date startDate, List<Session> sessions) {
		super();
		Id = id;
		Description = description;
		EndDate = endDate;
		Name = name;
		StartDate = startDate;
		this.sessions = sessions;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
	
}
