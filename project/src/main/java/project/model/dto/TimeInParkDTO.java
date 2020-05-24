package project.model.dto;

public class TimeInParkDTO {

	private String park;
	private String part_of_day;
	private int hours;
	private int minutes;
	
	public TimeInParkDTO() {
		
	}

	public String getPark() {
		return park;
	}

	public void setPark(String park) {
		this.park = park;
	}

	public String getPart_of_day() {
		return part_of_day;
	}

	public void setPart_of_day(String part_of_day) {
		this.part_of_day = part_of_day;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	
}
