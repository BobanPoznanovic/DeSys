package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	public JustForTesting test(@RequestParam(required = true) String text) {
		
		JustForTesting txt = new JustForTesting();
		txt.setText(text);
		deSysTestService.test(txt);
		
		return txt;
	}
}
