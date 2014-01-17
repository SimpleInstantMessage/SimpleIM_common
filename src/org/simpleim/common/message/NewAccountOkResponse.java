package org.simpleim.common.message;

public class NewAccountOkResponse extends OkResponse {
	private String id;
	private String password;

	/**
	 * You can use it like:
	 * <p>new NewAccountOkResponse().setId("blah").setPassword("blah");</p>
	 */
	public NewAccountOkResponse() {
		super();
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public NewAccountOkResponse setId(String id) {
		this.id = id;
		return this;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public NewAccountOkResponse setPassword(String password) {
		this.password = password;
		return this;
	}
}
