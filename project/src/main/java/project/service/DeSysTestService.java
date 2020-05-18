package project.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Host;
import project.model.JustForTesting;
import project.model.Location;
import project.model.Mode;
import project.model.Park;
import project.model.TimeCategory;
import project.model.TimeInPark;

@Service
public class DeSysTestService {

	private final KieContainer kieContainer;
	
	@Autowired
	public DeSysTestService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}
	
	public Host test(JustForTesting tested) {
		
		Host dolores = new Host();
		dolores.setFirst_name("Dolores");
		dolores.setLast_name("Abernathy");
		dolores.setCurrent_mode(Mode.CHARACHTER);
		Location location = new Location();
		location.setPark(Park.WESTWORLD);
		location.setLocation_name("Abernathy Ranch");
		location.setPlace(4);
		dolores.setCurrent_location(location);
		
		TimeInPark time = new TimeInPark();
		time.setPart_of_day(TimeCategory.SUNRISE);
		
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(tested);
		kieSession.insert(dolores);
		kieSession.insert(time);
		kieSession.fireAllRules();
		kieSession.dispose();
		
		return dolores;
	}
	
	public String test_narrative() {
		Host test_host = new Host();
		test_host.setFirst_name("Test");
		
		KieSession kieSession = kieContainer.newKieSession("narrativesSession");
		
		FakeService fake = new FakeService();
		kieSession.setGlobal("fake", fake);
		
		kieSession.insert(test_host);
		kieSession.fireAllRules();
		kieSession.dispose();
		
		return "From service testing narrative package";
	}
	
	public void testConsoleWrite() {
		System.out.println("Triggered from rules");
	}
}
