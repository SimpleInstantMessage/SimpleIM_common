package org.simpleim.common.message;

public class Message {
	private final String messageType;

	public Message() {
		super();
		messageType = this.getClass().getSimpleName();
	}
	/**
	 * @return the messageType
	 */
	public String getMessageType() {
		return messageType;
	}
	
}
