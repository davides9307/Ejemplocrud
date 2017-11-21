	package com.ejemplo.repositorio;
	
	import java.util.List;
	
	import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
	
	import org.springframework.stereotype.Repository;
	
	import com.ejemplo.dominio.Vehiculo;
	
	
	@Repository
	@Transactional
	public class VehiculoPersistencia implements VehiculoRepositorio{
	
		
	@PersistenceContext
	
	private EntityManager em;
		
		
		@Override
		public Vehiculo RegistrarVehiculos(Vehiculo vehiculo) {
			
		 return em.merge(vehiculo);
		
			
		}
	
	
		
		@SuppressWarnings("unchecked")
		@Override
		public List<Vehiculo> BuscarVehiculos() {
			
			return em.createNamedQuery("Vehiculo.findAll").getResultList();
		}
	
	
	
		@Override
		public Vehiculo BuscarVehiculoPorId(Vehiculo vehiculo) {
			
			return em.find(Vehiculo.class,vehiculo.getIdvehiculo());
		}
	
	
	
		@Override
		public Vehiculo ActualizarVehiculo(Vehiculo vehiculo) {
			return em.merge(vehiculo);
	
			
		}
	
	
	
		@Override
		public Vehiculo BorrarVehiculo(Vehiculo vehiculo) {
			
			
			Vehiculo vehiculoencontrado=em.find(Vehiculo.class, vehiculo.getIdvehiculo());
			em.remove(vehiculoencontrado);
			return vehiculoencontrado;
			
		}



		@Override
		public Vehiculo BuscarVehiculoPorMarcayMatricula(Vehiculo vehiculo) {
			Query query = em.createNamedQuery("Vehiculo.findbyMatricula");
			query.setParameter("marca",vehiculo.getMarca());
			query.setParameter("matricula",vehiculo.getMatricula());
			return (Vehiculo)query.getSingleResult();
		
		}
		
		
		
		
		
		
	
		
		
	}
