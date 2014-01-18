package org.simpleim.common.message;

public class SendMessageRequest extends Request {
    private User sender=new User();
    private String[] targetsIds;
    private ChatMessage message=new ChatMessage();
	public User getSender() {
		return sender;
	}
	public ChatMessage getMessage() {
		return message;
	}
	public String[] getTargetsIds(){
		return targetsIds;
	}
	/**
	 * 深拷贝
	 */
	public SendMessageRequest setTargetsIds(String [] targetsIds){
		this.targetsIds=new String[targetsIds.length];
		for(int i=0;i<targetsIds.length;i++){
			 this.targetsIds[i]=targetsIds[i];
		}
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
