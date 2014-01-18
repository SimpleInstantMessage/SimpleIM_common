package org.simpleim.common.message;

public class WorkFinishedNotification extends Notification {
    private Message what;
	public Message getWhat() {
		return what;
	}
	public WorkFinishedNotification setWhat(Message what) {
		this.what = what;
		return this;
	}
}
