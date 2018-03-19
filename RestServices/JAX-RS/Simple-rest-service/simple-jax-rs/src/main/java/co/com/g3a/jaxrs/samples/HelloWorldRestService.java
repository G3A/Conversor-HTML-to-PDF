package co.com.g3a.jaxrs.samples;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

 
@Path("/helloworld")
public class HelloWorldRestService {

   @GET
   @Path("sayHello")  
   @Produces("text/plain")
   public String sayHello() {
      return "Hello World!";
   }
}