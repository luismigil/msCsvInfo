package com.info.csv.ms.bean;

public class InfoField {
	
	private String value;
	
	private int count;

	public InfoField() {
		super();
	}

	public InfoField(String value, int count) {
		super();
		this.value = value;
		this.count = count;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
