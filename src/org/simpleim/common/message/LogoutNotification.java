package org.simpleim.common.message;

public class LogoutNotification extends Notification {
	private String userLoggedOutId;

	public String getUserLoggedOutId() {
		return userLoggedOutId;
	}

	public LogoutNotification setUserLoggedOutId(String userLoggedOutId) {
		this.userLoggedOutId = userLoggedOutId;
		return this;
	}

}
