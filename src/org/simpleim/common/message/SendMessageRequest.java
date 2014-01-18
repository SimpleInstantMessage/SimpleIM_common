package org.simpleim.common.message;

public class SendMessageRequest extends Request {
	private User sender;
	private String[] targetsIds;
	private ChatMessage message;

	public User getSender() {
		return sender;
	}

	public ChatMessage getMessage() {
		return message;
	}

	public String[] getTargetsIds() {
		return targetsIds;
	}

	public SendMessageRequest setTargetsIds(String[] targetsIds) {
		this.targetsIds = targetsIds;
		return this;
	}

	public SendMessageRequest setSender(User sender) {
		this.sender = sender;
		return this;
	}

	public SendMessageRequest setMessage(ChatMessage message) {
		this.message = message;
		return this;
	}

}
