package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import project.model.TimeInPark;
import project.model.dto.TimeInParkDTO;
import project.service.HostsCatalog;
import project.service.SystemService;

@RestController
public class SystemController {
	
	@Autowired
	private SystemService systemService;
	
	@RequestMapping(value="/set-time", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public TimeInPark setTime(@RequestBody TimeInParkDTO time) {
		TimeInPark parkTime = new TimeInPark();
		
		parkTime = systemService.setTime(time);
		
		return parkTime;
	}

}
