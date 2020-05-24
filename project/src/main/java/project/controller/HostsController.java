package project.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import project.model.Host;
import project.model.dto.CreateHostDTO;
import project.service.HostsCatalog;

@RestController
public class HostsController {
	
	@Autowired
	private HostsCatalog hostsCatalog;
	
	@RequestMapping(value="/get-hosts", method = RequestMethod.GET, produces = "application/json")
	public HashMap<String, Host> getHosts() {
		HashMap<String, Host> retVal;
		
		retVal = hostsCatalog.getMap();
		
		return retVal;
	}
	
	@RequestMapping(value="/add-host", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Host addHost(@RequestBody CreateHostDTO body) {
		
		Host host = hostsCatalog.createHost(body);
		
		return host;
	}
	
	@RequestMapping(value="/edit-host-location", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public Host changeHostLocation(@RequestBody CreateHostDTO body) {
		Host host = hostsCatalog.changeHostLocation(body);
		
		return host;
	}

}
