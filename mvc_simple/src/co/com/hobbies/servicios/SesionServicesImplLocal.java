package co.com.hobbies.servicios;

import java.util.List;

import co.com.hobbies.model.SesionDTO;
import co.com.hobbies.services.HobbiesFacade;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


/**
 * Recuperar la informacion de los objetos sesion que se muestran en la pantalla
 * 
 * @author Milton
 */
public class SesionServicesImplLocal implements SesionServicesInterface {

  public List<SesionDTO> getSesiones() {
    HobbiesFacade hobbiesFacade = new HobbiesFacade();
    List<SesionDTO> sesionDTOList = hobbiesFacade.getFirstSesionDTOFromIndex();
    return sesionDTOList;
  }

  // Metodo para probar los clientes
  public static void main(String args[]) {
    getMethod();
    
    postMethod();
  }

  private static void getMethod() {
    try {
      // Construye el cliente web
      Client client = Client.create();
      WebResource webResource = client.resource("http://localhost:8080/mvc_ws/rest/json/hobbies/sesion");
      
      // Envia la peticion al WS y obtiene la respuesta
      ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
      if (response.getStatus() != 200) {
        throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
      }

      // Se procesa la respuesta
      String output = response.getEntity(String.class);
      System.out.println("Output from Server .... \n");
      System.out.println(output);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  private static void postMethod() {
    try {
      // Construye el cliente web
      Client client = Client.create();
      WebResource webResource = client.resource("http://localhost:8080/mvc_ws/rest/json/hobbies/post");

      // Parse de DTO a JSON
      SesionDTO sesionDTO = new SesionDTO("Entretenimiento", "resources/img/portfolio/entretenimiento.jpg");
      Gson gson = new Gson();
      String json = gson.toJson(sesionDTO, SesionDTO.class);      
      
      // Envia la peticion al WS y obtiene la respuesta
      ClientResponse response = webResource.type("application/json").post(ClientResponse.class, json);
      if (response.getStatus() != 201) {
        throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
      }
      
      // Se procesa la respuesta
      String output = response.getEntity(String.class);
      System.out.println("Output from Server .... \n");
      System.out.println(output);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
