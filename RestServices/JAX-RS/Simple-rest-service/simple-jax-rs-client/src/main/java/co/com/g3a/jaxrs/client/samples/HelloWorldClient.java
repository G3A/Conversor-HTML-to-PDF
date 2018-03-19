package co.com.g3a.jaxrs.client.samples;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class HelloWorldClient {
	public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:9998/helloworld/sayHello");
        System.out.println(target.request(MediaType.TEXT_PLAIN).get(String.class)); 
      
    }
}

