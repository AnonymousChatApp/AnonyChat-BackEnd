package rest;

import models.Group;
import models.Message;
import models.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/chat")
public class ChatService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response submitUserName(String username) {
        //set username for new User

        return Response.status(200).build();
    }

    @GET
    @Path("/")
    public Response getGroups() {
        List<Group> groups = new ArrayList<>();

        return Response.status(200).entity(groups).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createGroup(User user) {
        //create new group

        return Response.status(200).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response leaveGroup(User user) {
        //leave the group

        return Response.status(200).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response submitNewMessage(Message message) {
        //submit new message

        return Response.status(200).build();
    }


}
