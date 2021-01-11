package com.mission35.springboot.first.quickstart.controller.cources;

public class Cource {
	private String name;
	private String description;
	private String content;
	
	
	public Cource() {
	}
	
	public Cource(String name, String description, String content) {
		super();
		this.name = name;
		this.description = description;
		this.content = content;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Cource [name=" + name + ", description=" + description + ", content=" + content + "]";
	}
	
	
}
