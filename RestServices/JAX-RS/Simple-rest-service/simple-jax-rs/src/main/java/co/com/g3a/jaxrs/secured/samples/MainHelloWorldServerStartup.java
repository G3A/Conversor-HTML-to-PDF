package co.com.g3a.jaxrs.secured.samples;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import com.sun.net.httpserver.HttpServer;

/*
 * Based on https://simplapi.wordpress.com/
 */
public class MainHelloWorldServerStartup {

	private final static int port = 9997;
	private final static String host = "http://localhost/";

	public static void main(String[] args) {
		URI baseUri = UriBuilder.fromUri(host).port(port).build();
		ResourceConfig config = new ResourceConfig().packages("co.com.g3a.jaxrs.secured.samples");
		// Add AuthFilter
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("jersey.config.server.provider.packages",
				"org.glassfish.jersey.filter;co.com.g3a.jaxrs.secured.samples.AuthFilter");
		properties.put("javax.ws.rs.container.ContainerRequestFilter",
				"org.glassfish.jersey.filter.LoggingFilter;co.com.g3a.jaxrs.secured.samples.AuthFilter");
		config.setProperties(properties);
		config.register(RolesAllowedDynamicFeature.class);
		HttpServer server = JdkHttpServerFactory.createHttpServer(baseUri, config);
	}
}