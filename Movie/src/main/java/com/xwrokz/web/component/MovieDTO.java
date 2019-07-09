package com.xwrokz.web.component;

import java.io.Serializable;

public class MovieDTO implements Serializable {

	private String name;
	private String date;
	private int nooftickets;
	private String theatreName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNooftickets() {
		return nooftickets;
	}

	public void setNooftickets(int nooftickets) {
		this.nooftickets = nooftickets;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	@Override
	public String toString() {
		System.out.println("Over  ridden method");
		return "MovieDTO [name=" + name + ", date=" + date + ", nooftickets=" + nooftickets + ", theatreName="
				+ theatreName + "]";
	}

}
