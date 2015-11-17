package co.com.hobbies.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.com.hobbies.model.SesionDTO;

import com.google.gson.Gson;

@Path("/json/hobbies")
public class HobbiesWS {

  @GET
  @Path("/sesion")
  @Produces(MediaType.APPLICATION_JSON)
  public Response getFirstSesionDTOFromIndex() {
    
    HobbiesFacade hobbiesFacade = new HobbiesFacade();
    List<SesionDTO> sesionList = hobbiesFacade.getFirstSesionDTOFromIndex();
    
    // Parser de la info
    Gson gson = new Gson();
    String json = gson.toJson(sesionList);
    return Response.status(201).entity(json).build();
  }
}
