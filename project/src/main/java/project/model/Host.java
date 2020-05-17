package project.model;

import java.util.ArrayList;

public class Host {

	private String id;
	
	private String first_name;
	
	private String last_name;
	
	//current location
	
	// private int age;
	
	private Mode current_mode;
	
	private Location current_location;
	
	private ArrayList<Item> inventory;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	private Mode getCurrent_mode() {
		return current_mode;
	}

	private void setCurrent_mode(Mode current_mode) {
		this.current_mode = current_mode;
	}

	public Location getCurrent_location() {
		return current_location;
	}

	public void setCurrent_location(Location current_location) {
		this.current_location = current_location;
	}

	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}
	
}
