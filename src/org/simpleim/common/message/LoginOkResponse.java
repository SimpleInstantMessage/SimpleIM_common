package org.simpleim.common.message;

public class LoginOkResponse {
  /**
   *  未使用setOnlineUsersIds之前，String是实体化的
   */
	private String[] onlineUsersIds;
   public LoginOkResponse(){
	   super();
   }
  public String[] getOnlineUsersIds() {
	return onlineUsersIds;
   }
  public LoginOkResponse setOnlineUsersIds(String[] onlineUsersIds) {
	  onlineUsersIds=new String[onlineUsersIds.length];
	  for(int i=0;i<onlineUsersIds.length;i++){
		  this.onlineUsersIds[i]=onlineUsersIds[i];
	  }
	  return this;
  }
   
}
