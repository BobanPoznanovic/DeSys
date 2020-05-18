package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.model.Host;
import project.model.JustForTesting;
import project.service.DeSysTestService;

@RestController
public class DeSysTestController {
	
	private final DeSysTestService deSysTestService;
	
	@Autowired
	public DeSysTestController(DeSysTestService deSysTestService) {
		this.deSysTestService = deSysTestService;
	}

	@RequestMapping(value="/test", method = RequestMethod.GET, produces = "application/json")
	public Host test(@RequestParam(required = true) String text) {
		
		JustForTesting txt = new JustForTesting();
		txt.setText(text);
		Host retVal = deSysTestService.test(txt);
		
		return retVal;
	}
	
	@RequestMapping(value = "/test-narrative", method = RequestMethod.GET, produces = "application/json")
	public String test_narrative_rules() {
		
		String retVal;
		
		retVal = deSysTestService.test_narrative();
		
		return retVal;
	}
}
