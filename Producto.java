package Pto1;

import java.time.LocalDate;

public class Producto {
	
	private String nombre;
	private String descripcion;
	private Integer cant;
	private Double precio;
	

	
	public Producto(String nombre) {
		this.setNombre(nombre);
	}
	
	public Producto(String nombre, String descripcion, Integer cant, Double precio) {
		this.setNombre(nombre);
		this.setDescripcion(descripcion); 
		this.setcant(cant);
		this.setPrecio(1,precio);
	
	}

	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Integer getcant() {
		return cant;
	}

	public void setcant(Integer cant) {
		this.cant = cant;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Integer cant,Double precio) {
		this.precio = cant *precio;
	}
	
	
}