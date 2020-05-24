package project.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Host;
import project.model.hostEvents.HostEvent;
import project.model.hostEvents.HostLocationChangeEvent;

@Service
public class DeSysHostService {

	private final KieContainer kieContainer;
	
	@Autowired
	public DeSysHostService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}
	
	public void hostCreated(HostEvent event) {
		
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		//kieSession.insert(host);
		kieSession.insert(event);
		kieSession.fireAllRules();
		kieSession.dispose();
		
	}
	
	public void hostUpdated(Host host) {
		
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(host);
		kieSession.fireAllRules();
		kieSession.dispose();
	}
	
	public void hostLocationChange(HostLocationChangeEvent hlce) {
		
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(hlce);
		kieSession.fireAllRules();
		kieSession.dispose();
	}
}
