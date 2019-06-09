package com.api.DonutAPI.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Donut {
	private Integer count;
	private ArrayList<Results> results;
	
	
	public Donut(Integer count, ArrayList<Results> results) {
		super();
		this.count = count;
		this.results = results;
	}
	public Donut() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public ArrayList<Results> getResults() {
		return results;
	}
	public void setResults(ArrayList<Results> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "Donut [count=" + count + "]";
	}
	
	
}
