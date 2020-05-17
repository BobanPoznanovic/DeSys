package project.model;

public class TimeInPark {

	private Park park;
	
	private TimeCategory part_of_day;
	
	private int hours;
	
	private int minutes;

	public Park getPark() {
		return park;
	}

	public void setPark(Park park) {
		this.park = park;
	}

	public TimeCategory getPart_of_day() {
		return part_of_day;
	}

	public void setPart_of_day(TimeCategory part_of_day) {
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
