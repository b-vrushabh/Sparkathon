package com.nice.models;

public class Security {
	
	
	private String name;
	private String ISIN;
	private int id;
	
	

	public Security( int id, String name, String iSIN) {
		super();
		this.name = name;
		ISIN = iSIN;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getISIN() {
		return ISIN;
	}
	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
