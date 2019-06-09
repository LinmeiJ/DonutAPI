package com.api.DonutAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
	private Integer id;
	private String ref;
	private String name;
	
	
	public Results() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Results(Integer id, String ref, String name) {
		super();
		this.id = id;
		this.ref = ref;
		this.name = name;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getRef() {
		return ref;
	}




	public void setRef(String ref) {
		this.ref = ref;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "Results [id=" + id + ", ref=" + ref + ", name=" + name + "]";
	}
	
	
}
