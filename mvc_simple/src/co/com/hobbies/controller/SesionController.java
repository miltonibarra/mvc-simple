package co.com.hobbies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.hobbies.modelo.SesionDTO;
import co.com.hobbies.servicios.SesionServicesImplLocal;
import co.com.hobbies.servicios.SesionServicesInterface;

@Controller
public class SesionController {
	
	@RequestMapping(value = "/sesion", method = RequestMethod.GET)
	public ModelAndView inicioSesiones() {
		
		/* Invocar el servicio. **/
		SesionServicesInterface rSesion = new SesionServicesImplLocal();
		
		ModelAndView modelAndView = new ModelAndView("index", "sesionobj", rSesion.getSesiones());
		return modelAndView;
	}

}
