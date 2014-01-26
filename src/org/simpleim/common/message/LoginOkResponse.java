package org.simpleim.common.message;

public class LoginOkResponse extends OkResponse{
	private String[] onlineUsersIds;

	public String[] getOnlineUsersIds() {
		return onlineUsersIds;
	}

	public LoginOkResponse setOnlineUsersIds(String[] onlineUsersIds) {
		this.onlineUsersIds = onlineUsersIds;
		return this;
	}

}
