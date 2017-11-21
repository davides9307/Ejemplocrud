package com.ejemplo.dominio;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.ejemplo.repositorio.VehiculoRepositorio;

@ComponentScan("com.ejemplo.repositorio")
@Service
public class Vigilante implements ServicioVigilante{

	
	@Autowired
	private VehiculoRepositorio vehiculorepositorio;
	
	
	
	public Vigilante(VehiculoRepositorio vehiculorepositorio) {
		
		this.vehiculorepositorio = vehiculorepositorio;
		
	}
	
	
	
	
	public Vehiculo RegistarEntrada(Vehiculo vehiculo) {
		
		return vehiculorepositorio.RegistrarVehiculos(vehiculo);
		
		
		
		
		
		
	}




	@Override
	public List<Vehiculo> ConsultarVehiculos() {
		return vehiculorepositorio.BuscarVehiculos();
		
	}




	@Override
	public Vehiculo ActualizarVehiculo(Vehiculo vehiculo) {
		
		
		return vehiculorepositorio.ActualizarVehiculo(vehiculo);
		
	}




	@Override
	public Vehiculo BuscarVehiculo(Vehiculo vehiculo) {
		return vehiculorepositorio.BuscarVehiculoPorId(vehiculo);
		
	}




	@Override
	public Vehiculo EliminarVehiculo(Vehiculo vehiculo) {
		return vehiculorepositorio.BorrarVehiculo(vehiculo);
		
	}




	@Override
	public Vehiculo BuscarVehiculoPorMarcayMatricula(Vehiculo vehiculo) {
		return vehiculorepositorio.BuscarVehiculoPorMarcayMatricula(vehiculo);
		
	}
}
