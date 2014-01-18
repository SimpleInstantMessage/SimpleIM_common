package org.simpleim.common.message;

public class LoginOkResponse {
	private String[] onlineUsersIds;
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
