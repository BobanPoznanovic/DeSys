package project.model.hostEvents;

import project.model.Location;

public class HostLocationChangeEvent {
	
	private String hostID;
	private Location location;
	
	public HostLocationChangeEvent(String id, Location location) {
		setHostID(id);
		setLocation(location);
	}

	public String getHostID() {
		return hostID;
	}

	public void setHostID(String hostID) {
		this.hostID = hostID;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
