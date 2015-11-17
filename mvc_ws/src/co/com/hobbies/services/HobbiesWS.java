package co.com.hobbies.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.com.hobbies.model.SesionDTO;

@Path("/json/hobbies")
public class HobbiesWS {
  
  @GET
  @Path("/sesion")
  @Produces(MediaType.APPLICATION_JSON)
  public List<SesionDTO> getFirstSesionDTOFromIndex() {
    HobbiesFacade hobbiesFacade = new HobbiesFacade();
    List<SesionDTO> sesionList = hobbiesFacade.getFirstSesionDTOFromIndex();

    // Se retorna el objeto
    return sesionList;
  }
  
  @POST
  @Path("/post")
  @Consumes(MediaType.APPLICATION_JSON)
  public Response getFirstSesionDTOFromIndexPost(SesionDTO sesionDTO) {
    String result = "sesionDTO saved : " + sesionDTO.getTitulo() + " src: " + sesionDTO.getImagen();
    return Response.status(201).entity(result).build();      
  }
}
