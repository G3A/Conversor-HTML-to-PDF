package co.com.g3a.jaxrs.secured.samples;

import javax.ws.rs.core.SecurityContext;
import java.security.Principal;

/**
 * Custom Security Context.
 * 
 * @author Deisss (MIT License)
 * Based on https://simplapi.wordpress.com/
 */
public class CustomApplicationSecurityContext implements SecurityContext {
	private User user;
	private String scheme;

	public CustomApplicationSecurityContext(User user, String scheme) {
		this.user = user;
		this.scheme = scheme;
	}

	@Override
	public Principal getUserPrincipal() {
		return this.user;
	}

	@Override
	public boolean isUserInRole(String s) {
		if (user.getRoles() != null) {
			return user.getRoles().contains(s);
		}
		return false;
	}

	@Override
	public boolean isSecure() {
		return "https".equals(this.scheme);
	}

	@Override
	public String getAuthenticationScheme() {
		return SecurityContext.BASIC_AUTH;
	}
}