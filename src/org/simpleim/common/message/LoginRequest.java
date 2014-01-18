package org.simpleim.common.message;

public class LoginRequest extends Request {
	private String id;
	private String password;

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public LoginRequest setId(String id) {
		this.id = id;
		return this;
	}

	public LoginRequest setPassword(String password) {
		this.password = password;
		return this;
	}
}
