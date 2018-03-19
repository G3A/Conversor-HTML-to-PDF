package co.com.g3a.jaxrs.secured.samples;

import java.security.Principal;
import java.util.List;

/**
 * User bean.
 *
 * @author Deisss (MIT License)
 * @modified G3A
 * Based on https://simplapi.wordpress.com/
 */
public class User implements Principal {
	private String id;
	private String  firstName;
	private String lastName;
	private String login;
	private String email;
	private String password;
	
	private List<String> roles;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
}