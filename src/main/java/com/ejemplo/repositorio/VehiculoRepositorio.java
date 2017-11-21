package com.ejemplo.repositorio;
import java.util.List;

import com.ejemplo.dominio.Vehiculo;

public interface VehiculoRepositorio {

	public Vehiculo RegistrarVehiculos(Vehiculo vehiculo); 
	public List<Vehiculo> BuscarVehiculos();
	public Vehiculo BuscarVehiculoPorId(Vehiculo vehiculo);
	public Vehiculo ActualizarVehiculo(Vehiculo vehiculo);
	public Vehiculo BorrarVehiculo(Vehiculo vehiculo);
	public Vehiculo BuscarVehiculoPorMarcayMatricula(Vehiculo vehiculo);
	
	
	
}
