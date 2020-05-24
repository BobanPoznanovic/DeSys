package project.model.hostEvents;

import project.model.HostDialogMessage;

public class HostDialogEvent {

	private long id;
	
	private String sender_id;
	
	private String receiver_id;
	
	private HostDialogMessage message;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSender_id() {
		return sender_id;
	}

	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}

	public String getReceiver_id() {
		return receiver_id;
	}

	public void setReceiver_id(String receiver_id) {
		this.receiver_id = receiver_id;
	}

	public HostDialogMessage getMessage() {
		return message;
	}

	public void setMessage(HostDialogMessage message) {
		this.message = message;
	}
}
