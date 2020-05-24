package project.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import project.model.Host;
import project.model.Item;
import project.model.Location;
import project.model.Mode;
import project.model.Park;
import project.model.dto.CreateHostDTO;

@Service
public class HostsCatalog {
	
	private HashMap<String, Host> hosts;
	
	public HostsCatalog() {
		this.hosts = new HashMap<String, Host>();
	}
	
	public Host changeHostLocation(CreateHostDTO body) {
		Host host = hosts.get(body.getId());
		
		if(host==null) {
			return null;
		}
		else {
			Location location = new Location();
			location.setPark(checkPark(body.getPark()));
			location.setLocation_name(body.getLocation_name());
			location.setPlace(body.getLocation_place());
			
			host.setCurrent_location(location);
			
			return host;
		}
	}
	
	public Host createHost(CreateHostDTO body) {
		Host host = new Host();
		
		host.setId(body.getId());
		host.setFirst_name(body.getFirst_name());
		host.setLast_name(body.getLast_name());
		
		Location location = new Location();
		String strPark = body.getPark();
		location.setPark(checkPark(strPark));
		location.setLocation_name(body.getLocation_name());
		location.setPlace(body.getLocation_place());
		
		host.setCurrent_location(location);
		
		host.setCurrent_mode(checkMode(body.getMode()));
		
		host.setInventory(new ArrayList<Item>());
		
		return addHost(host);
	}
	
	public Park checkPark(String strPark) {
		Park[] parks = Park.values();
		Park retVal = null;
		
		for(Park park : parks) {
			if(park.name().equals(strPark)) {
				retVal = park;
				break;
			}
		}
		
		return retVal;		
	}
	
	public Mode checkMode(String strMode) {
		Mode[] modes = Mode.values();
		Mode retVal = null;
		
		for(Mode mode : modes) {
			if(mode.name().equals(strMode)) {
				retVal = mode;
				break;
			}
		}
		
		return retVal;
	}
	
	public Host addHost(Host host) {
		
		hosts.put(host.getId(), host);
		
		return host;
	}
	
	public HashMap<String, Host> getMap() {
		
		if(this.hosts.isEmpty()) {
			return null;
		}
		else {
			return this.hosts;
		}
	}

}
