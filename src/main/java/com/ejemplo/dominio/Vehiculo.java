	package com.ejemplo.dominio;
	
	import java.time.LocalDateTime;
	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.NamedQueries;
	import javax.persistence.NamedQuery;
	
	
	@Entity
	@NamedQueries( { @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v ORDER BY v.idvehiculo"),
	@NamedQuery(name = "Vehiculo.findbyMatricula", query = "SELECT s FROM Vehiculo s WHERE s.Matricula = :matricula and s.Marca= :marca")	
	
	})
		public class Vehiculo {
			
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Integer idvehiculo;
		    
			@Column(nullable=false,unique=true)
			private String Matricula;
			
			@Column(nullable=false)
			private Integer Cilindraje;
			
			private String Marca;
			
			private LocalDateTime Fechaentrada;
			
		
			
			public Vehiculo(){
				
				
			}
			
			
			public Vehiculo(String matricula,Integer cilindraje,String Marca,LocalDateTime fechaentrada,String tipo) {
			
				this.Matricula = matricula;
				this.Cilindraje = cilindraje;
				this.Marca =Marca;
				this.Fechaentrada =fechaentrada;
			
			}
			
			
			
			public Vehiculo(String matricula,Integer cilindraje,String Marca) {
				
				this.Matricula = matricula;
				this.Cilindraje = cilindraje;
				this.Marca =Marca;
				
			}
	
			
			public void Syncwith(String matricula,Integer cilindraje,String Marca,LocalDateTime fechaentrada,String tipo) {
				this.Matricula = matricula;
				this.Cilindraje = cilindraje;
				this.Marca =Marca;
				this.Fechaentrada =fechaentrada;
			
				
				
			}
	
	
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((Cilindraje == null) ? 0 : Cilindraje.hashCode());
				result = prime * result + ((Fechaentrada == null) ? 0 : Fechaentrada.hashCode());
				result = prime * result + ((Marca == null) ? 0 : Marca.hashCode());
				result = prime * result + ((Matricula == null) ? 0 : Matricula.hashCode());
				result = prime * result + ((idvehiculo == null) ? 0 : idvehiculo.hashCode());
				return result;
			}
	
	
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Vehiculo other = (Vehiculo) obj;
				if (Cilindraje == null) {
					if (other.Cilindraje != null)
						return false;
				} else if (!Cilindraje.equals(other.Cilindraje))
					return false;
				if (Fechaentrada == null) {
					if (other.Fechaentrada != null)
						return false;
				} else if (!Fechaentrada.equals(other.Fechaentrada))
					return false;
				if (Marca == null) {
					if (other.Marca != null)
						return false;
				} else if (!Marca.equals(other.Marca))
					return false;
				if (Matricula == null) {
					if (other.Matricula != null)
						return false;
				} else if (!Matricula.equals(other.Matricula))
					return false;
				if (idvehiculo == null) {
					if (other.idvehiculo != null)
						return false;
				} else if (!idvehiculo.equals(other.idvehiculo))
					return false;
				return true;
			}
	
	
			public String getMatricula() {
				return Matricula;
			}
	
	
			public Integer getCilindraje() {
				return Cilindraje;
			}
	
	
			
	
			public String getMarca() {
				return Marca;
			}
			
			
	
			public LocalDateTime getFechaentrada() {
				return Fechaentrada;
			}
			
			public Integer getIdvehiculo() {
				return idvehiculo;
			}
	
	
			public void setIdvehiculo(Integer idvehiculo) {
				this.idvehiculo = idvehiculo;
			}
	
	
			public void setMatricula(String matricula) {
				Matricula = matricula;
			}
	
	
			public void setCilindraje(Integer cilindraje) {
				Cilindraje = cilindraje;
			}
	
	
			public void setMarca(String marca) {
				Marca = marca;
			}
	
	
			public void setFechaentrada(LocalDateTime fechaentrada) {
				Fechaentrada = fechaentrada;
			}
	
			 
	
	
	
	
		/*
			public String getParqueado() {
				return parqueado;
			}
	
	
	
			public void setParqueado(String parqueado) {
				this.parqueado = parqueado;
			}
	
		*/
	
			@Override
			public String toString() {
				return "vehiculo [idVehiculo=" + idvehiculo + ", Matricula=" + Matricula + ", Cilindraje=" + Cilindraje
						+ ", Marca=" + Marca + ", Fechaentrada=" + Fechaentrada + "]";
			}
			
			
	
		}
	
	
	
