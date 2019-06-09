package com.api.DonutAPI.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Details {
	private Integer id;
	private String name;
	private Integer calories;
	private ArrayList<String> extras;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public ArrayList<String> getExtras() {
		return extras;
	}
	public void setExtras(ArrayList<String> extras) {
		this.extras = extras;
	}
	public Details(Integer id, String name, Integer calories, ArrayList<String> extras) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.extras = extras;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + ", calories=" + calories + ", extras=" + extras + "]";
	}
	
	
	
	
}
