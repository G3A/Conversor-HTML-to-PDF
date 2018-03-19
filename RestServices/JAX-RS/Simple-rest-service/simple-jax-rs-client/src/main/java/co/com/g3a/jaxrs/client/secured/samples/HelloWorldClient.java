package co.com.g3a.jaxrs.client.secured.samples;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class HelloWorldClient {
	public static void main(String[] args) {
        HttpAuthenticationFeature autentificacion = HttpAuthenticationFeature.basic("otheradmin", "otheradminpassword");
    	Client client = ClientBuilder.newClient();
    	client.register(autentificacion);
        
        WebTarget target = client.target("http://localhost:9997/helloworld/sayHello");
        System.out.println(target.request(MediaType.TEXT_PLAIN).get(String.class)); 
    }
}

