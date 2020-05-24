package project.model.dto;

public class CreateHostDTO {

	private String id;
	private String first_name;
	private String last_name;
	private String mode;
	private String park;
	private String location_name;
	private int location_place;
	
	public CreateHostDTO() {
		
	}

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

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getPark() {
		return park;
	}

	public void setPark(String park) {
		this.park = park;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public int getLocation_place() {
		return location_place;
	}

	public void setLocation_place(int location_place) {
		this.location_place = location_place;
	}
	
	
}
