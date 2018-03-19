package co.com.g3a.jaxrs.samples;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.sun.net.httpserver.HttpServer;

public class MainHelloWorldServerStartup {

	private final static int port = 9998;
	private final static String host = "http://localhost/";

	public static void main(String[] args) {
		URI baseUri = UriBuilder.fromUri(host).port(port).build();
		ResourceConfig config = new ResourceConfig().packages("co.com.g3a.jaxrs.samples");
		HttpServer server = JdkHttpServerFactory.createHttpServer(baseUri, config);

	}
}