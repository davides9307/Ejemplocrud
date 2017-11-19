package com.ejemplo.dominio;

import java.util.List;

public interface ServicioVigilante {

	
	public Vehiculo RegistarEntrada(Vehiculo vehiculo);
	public List<Vehiculo> ConsultarVehiculos();
	public Vehiculo ActualizarVehiculo(Vehiculo vehiculo);
	public Vehiculo BuscarVehiculo(Vehiculo vehiculo);
	public Vehiculo EliminarVehiculo(Vehiculo vehiculo);
	
}
