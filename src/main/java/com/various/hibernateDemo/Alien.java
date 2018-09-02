package com.various.hibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien { 	//POJO
	
	@Id
	private int idalien;
	private String aname,color;
	
	public Alien() {
		
	}
	
	
	public int getIdalien() {
		return idalien;
	}


	public void setIdalien(int idalien) {
		this.idalien = idalien;
	}


	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
