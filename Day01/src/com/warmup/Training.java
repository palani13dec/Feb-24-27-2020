package com.warmup;

import java.util.ArrayList;
import java.util.List;

public class Training {
	private String name;
	private String instructor;
	private int duration;
	private String comments;
	
	private List<String> participants = new ArrayList<>();
	
	public void register(String participant) {
		participants.add(participant);
	}
	
	
	
	public List<String> getParticipants() {
		return participants;
	}



	public Training(String name, String instructor, int duration) {
		this.name = name;
		this.instructor = instructor;
		this.duration = duration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
