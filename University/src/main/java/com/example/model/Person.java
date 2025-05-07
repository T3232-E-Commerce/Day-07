package com.example.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
	private String Email;
	private String Gender;
	private String Name;
	private Long Phone;
	
	
}
