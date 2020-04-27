package project.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.JustForTesting;

@Service
public class DeSysTestService {

	private final KieContainer kieContainer;
	
	@Autowired
	public DeSysTestService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}
	
	public JustForTesting test(JustForTesting tested) {
		
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(tested);
		kieSession.fireAllRules();
		kieSession.dispose();
		
		return tested;
	}
}
