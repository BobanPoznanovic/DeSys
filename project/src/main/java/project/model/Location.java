package project.model;

public class Location {

	private Park park; //e.g. Westworld
	
	private String location_name; // e.g. Sweetwater, Abernathy Ranch
	
	private int place;
	
	/* E.g. for Sweetwater
	 * 0 - Train station
	 * 1 - Wide area
	 * 2 - Lower Street
	 * 3 - Mariposa Saloon entrance
	 * 4 - Mariposa Saloon lower floor - tables
	 * 5 - Mariposa Saloon lower floor - bar
	 * 6 - Mariposa Saloon upper floor
	 * 7 - Upper Street // Where Dolores goes shopping
	 * 8 - Mave's house
	 * 
	 * E.g for Abernathy ranch
	 * 0 - Entrance to ranch
	 * 1 - Path to house
	 * 2 - Front porch
	 * 3 - Lower house floor
	 * 4 - Upper house floor - Dolores' room
	 * 5 - Back porch
	 * 6 - Back yard
	 * 7 - Barn
	 */

	public Park getPark() {
		return park;
	}

	public void setPark(Park park) {
		this.park = park;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	} 
	
	
}
