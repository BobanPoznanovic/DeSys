package project.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.TimeInPark;

@Service
public class DeSysGeneralService {
	
	private final KieContainer kieContainer;
	
	@Autowired
	public DeSysGeneralService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}
	
	public void setTimeInPark(TimeInPark time) {
		
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(time);
		kieSession.fireAllRules();
		kieSession.dispose();
		
	}
	
	public void changeTimeInPark() {
		
	}

}
