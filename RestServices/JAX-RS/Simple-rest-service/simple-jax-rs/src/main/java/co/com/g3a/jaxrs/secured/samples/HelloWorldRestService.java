package co.com.g3a.jaxrs.secured.samples;
 
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

 
@Path("/helloworld")
@RolesAllowed({"ADMIN", "OPERATOR"})
public class HelloWorldRestService {

   @GET
   @Path("sayHello")  
   @Produces("text/plain")
   @RolesAllowed("ADMIN")
   public String sayHello() {
      return "Hello World!";
   }
}