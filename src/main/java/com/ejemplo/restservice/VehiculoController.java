package com.ejemplo.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.ejemplo.dominio.ServicioVigilante;
import com.ejemplo.dominio.Vehiculo;



@RestController
@ComponentScan("com.ejemplo.dominio")
@EnableAutoConfiguration
public class VehiculoController {
	
	@Autowired
	ServicioVigilante vigilante;
	
	
	@GetMapping(value = "/ConsultarVehiculos")
	public ResponseEntity<List<Vehiculo>> Consultarvehiculos(
			) {

		 List<Vehiculo> lista =vigilante.ConsultarVehiculos();
		
		
 	     return new ResponseEntity<List<Vehiculo>>(lista,HttpStatus.OK);
	}
	
	
	
	
	
	@RequestMapping(value = "/RegistrarVehiculo", method = RequestMethod.POST)
	public ResponseEntity<Vehiculo> RegistrarVehiculo(
	        @RequestBody Vehiculo vehiculo) {
		
		 vigilante.RegistarEntrada(vehiculo);

	     return new ResponseEntity<Vehiculo>(vehiculo,HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/ActualizarVehiculo", method = RequestMethod.PUT)
	public ResponseEntity<Vehiculo> ActualizarVehiculo(
	        @RequestBody Vehiculo vehiculo) {
		
		 vigilante.ActualizarVehiculo(vehiculo);

	     return new ResponseEntity<Vehiculo>(vehiculo,HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/EliminarVehiculo", method = RequestMethod.PUT)
	public ResponseEntity<Vehiculo> EliminarVehiculo(
	        @RequestBody Vehiculo vehiculo) {
		
		 vigilante.EliminarVehiculo(vehiculo);

	     return new ResponseEntity<Vehiculo>(vehiculo,HttpStatus.OK);
	}

}
