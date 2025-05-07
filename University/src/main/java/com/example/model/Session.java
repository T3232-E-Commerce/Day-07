package com.example.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "session")
public class Session {

	@Id
	private String Id;
	private  Date Date;
	private String Description;
	private String Name;
	private Time Time ;
	
	@ManyToOne
	@JoinColumn(name = "workshop_id")
	private Workshop workshop;
	
	@ManyToMany(mappedBy = "sessions" )
	private List<Presenter> presenters;
	
	@ManyToMany(mappedBy = "sessions")
	private List<Undergraduate> undergraduates;
	
	@ManyToMany(mappedBy ="sessions")
	private List<Postgraduate> postgraduates;
	
	public Session() {
		
	}

	public Session(String id, java.sql.Date date, String description, String name, java.sql.Time time,
			Workshop workshop, List<Presenter> presenters, List<Undergraduate> undergraduates,
			List<Postgraduate> postgraduates) {
		super();
		Id = id;
		Date = date;
		Description = description;
		Name = name;
		Time = time;
		this.workshop = workshop;
		this.presenters = presenters;
		this.undergraduates = undergraduates;
		this.postgraduates = postgraduates;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Time getTime() {
		return Time;
	}

	public void setTime(Time time) {
		Time = time;
	}

	public Workshop getWorkshop() {
		return workshop;
	}

	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}

	public List<Presenter> getPresenters() {
		return presenters;
	}

	public void setPresenters(List<Presenter> presenters) {
		this.presenters = presenters;
	}

	public List<Undergraduate> getUndergraduates() {
		return undergraduates;
	}

	public void setUndergraduates(List<Undergraduate> undergraduates) {
		this.undergraduates = undergraduates;
	}

	public List<Postgraduate> getPostgraduates() {
		return postgraduates;
	}

	public void setPostgraduates(List<Postgraduate> postgraduates) {
		this.postgraduates = postgraduates;
	}
	
	
}
