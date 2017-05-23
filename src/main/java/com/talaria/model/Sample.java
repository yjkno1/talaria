package com.talaria.model;

import com.fasterxml.jackson.annotation.JsonView;

public class Sample {
	@JsonView(View.Summary.class)
	private int sample_no;
	
	@JsonView(View.SummaryWithName.class)
	private String sample_title;
	
	public int getSample_no() {
		return sample_no;
	}
	public void setSample_no(int sample_no) {
		this.sample_no = sample_no;
	}
	public String getSample_title() {
		return sample_title;
	}
	public void setSample_title(String sample_title) {
		this.sample_title = sample_title;
	}
	
}
