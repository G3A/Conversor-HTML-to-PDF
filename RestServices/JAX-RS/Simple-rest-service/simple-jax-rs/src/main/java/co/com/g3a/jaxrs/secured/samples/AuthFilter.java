package co.com.g3a.jaxrs.secured.samples;

import java.util.Base64;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

/**
 * Jersey HTTP Basic Auth filter
 * 
 * @author Deisss (LGPLv3)
 * @modified G3A
 * Based on https://simplapi.wordpress.com/
 * Tener presente esto
 * https://stackoverflow.com/questions/9534602/what-is-the-difference-between-digest-and-basic-authentication
 */
@Provider
@PreMatching
public class AuthFilter implements ContainerRequestFilter {

	/**
	 * Apply the filter : check input request, validate or not with user auth
	 * 
	 * @param containerRequest
	 *            The request from Tomcat server
	 */
	@Override
	public void filter(ContainerRequestContext containerRequest) throws WebApplicationException {
		// GET, POST, PUT, DELETE, ...
		String method = containerRequest.getMethod();
		// myresource/get/56bCA for example
		String path = containerRequest.getUriInfo().getPath(true);
		// We do allow wadl to be retrieve
		if (method.equals("GET") && (path.equals("application.wadl") || path.equals("application.wadl/xsd0.xsd"))) {
			return;
		}

		// Get the authentification passed in HTTP headers parameters
		String auth = containerRequest.getHeaderString("authorization");

		// This assumes that the authentication header is Basic, whereas it might not
		// be. You should check that the authorization header starts with 'Basic' and if
		// not throw unauthorized. Same thing for ensuring that the rest of the
		// information is actually base64-encoded. from
		// https://stackoverflow.com/users/1596371/jgm and
		// https://stackoverflow.com/questions/14608162/basic-http-authentication-with-jersey-grizzly
		auth = auth.replaceFirst("[Bb]asic ", "");
		try {
			Base64.Decoder decoder = Base64.getDecoder();
		    decoder.decode(auth);
		} catch(IllegalArgumentException iae) {
			throw new WebApplicationException(Status.UNAUTHORIZED);
		}

		// If the user does not have the right (does not provide any HTTP Basic Auth)
		if (auth == null) {
			throw new WebApplicationException(Status.UNAUTHORIZED);
		}

		// lap : loginAndPassword
		String[] lap = BasicAuth.decode(auth);

		// If login or password fail
		if (lap == null || lap.length != 2) {
			throw new WebApplicationException(Status.UNAUTHORIZED);
		}

		// DO YOUR DATABASE CHECK HERE (replace that line behind)...
		User authentificationResult = AuthentificationThirdParty.authentification(lap[0], lap[1]);

		// Our system refuse login and password
		if (authentificationResult == null) {
			throw new WebApplicationException(Status.UNAUTHORIZED);
		}

		// We configure your Security Context here
		String scheme = containerRequest.getUriInfo().getRequestUri().getScheme();
		containerRequest.setSecurityContext(new CustomApplicationSecurityContext(authentificationResult, scheme));

		// TODO : HERE YOU SHOULD ADD PARAMETER TO REQUEST, TO REMEMBER USER ON YOUR
		// REST SERVICE...

		return;
	}
}