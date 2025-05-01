package webHelloREST;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("HiHi")
public class HelloResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello World";
	}
	
	// Generate HTML Media Type
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML() {
		return "<html><body><h1>Hello World</h1></body></html>";
	}
	
	// Generate JSON Media Type
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public University sayJSONHello() {
		return new University("Montreal University", 1984, 6);
	}
	
	// Generate HTML Media Type
	@Path("/childpath/{urlName}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLParameterHello(@PathParam("urlName") String name) {
		return "<html><body><h1>Hello World from "+ name +"</h1></body></html>";
	}
}
