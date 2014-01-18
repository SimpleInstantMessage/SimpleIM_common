package org.simpleim.common.message;

public class ReceiveMessageNotification extends Notification{
        private User sender=new User();
        private ChatMessage message=new ChatMessage();
        public User getSender(){
        	return sender;
        }
        public ChatMessage getMessage(){
        	return message;
        }
        public ReceiveMessageNotification setSender(User sender){
        	this.sender=sender;
        	return this;
        }
        public ReceiveMessageNotification setMessage(ChatMessage message){
        	this.message=message;
        	return this;
        }
}
