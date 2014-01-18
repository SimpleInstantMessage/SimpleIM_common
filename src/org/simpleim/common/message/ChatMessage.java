package org.simpleim.common.message;

public class ChatMessage{
   private Long sendTime;
private Long recieveTime;
   private String body;
   /**
	 * You can use it like:
	 * <p>new NewChatMessage().setSendtime(int).setRecieve(int).setBody(String);</p>
	 */
public ChatMessage(){
	super();
	sendTime = System.currentTimeMillis();
}
public long getSendTime() {
	return sendTime;
}
public long getRecieveTime() {
	return recieveTime;
}
public String getBody() {
	return body;
}
public ChatMessage setSendTime(long sendTime) {
	this.sendTime = sendTime;
	return this;
}
public ChatMessage setRecieveTime(long recieveTime) {
	this.recieveTime = recieveTime;
	return this;
}
public ChatMessage setBody(String body) {
	this.body = body;
	return this;
}
   
}
