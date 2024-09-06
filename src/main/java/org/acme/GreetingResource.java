import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;

@Path("/sample")
public class GreetingResource {

    @GET
    public Response getSample(@QueryParam("param") String param) {
        // Create JSON response
        String jsonResponse = "{\"param\": \"" + param + "\"}";

        // Return the response with application/json media type
        return Response.ok(jsonResponse, MediaType.APPLICATION_JSON).build();
    }
}
