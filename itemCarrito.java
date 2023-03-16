package Pto1;
import Pto1.Carrito;

public class itemCarrito extends Producto{

	private int codigo;
	
	public itemCarrito(String nombre, String descripcion, int cant, Double precio, int codigo) {
		super(nombre,descripcion,cant,precio);
		this.codigo= codigo;
		
	}
	public int getCodigo() {
		return codigo;
	}

	public void setcodigo(int codigo) {
		this.codigo = codigo;
	}	
	
}
