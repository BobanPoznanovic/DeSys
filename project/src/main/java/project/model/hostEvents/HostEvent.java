package project.model.hostEvents;

import project.model.Host;

public class HostEvent {
	
	private Host host;
	
	public HostEvent(Host host) {
		setHost(host);
	}

	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

}
