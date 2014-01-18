package org.simpleim.common.message;

public class LoginNotification extends Notification{
   private String newUserId;
   public String getNewUserId() {
	 return newUserId;
   }
   public LoginNotification setNewUserId(String newUserId) {
	 this.newUserId = newUserId;
	 return this;
   }
   
} 
