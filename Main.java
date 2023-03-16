package Pto1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import Pto1.Carrito;
import Pto1.Producto;
import Pto1.itemCarrito;

public class Main {

	public static void main(String[] args) {
		String rr="recursos/productos.txt";
		Path pr= Paths.get(rr);
		int d=0;
		Producto a = new Producto(null);
		Producto b = new Producto(null);
		Producto c = new Producto(null);
		try {
			for(String linea:Files.readAllLines(pr))
			{
			
			String produc[]=linea.split(" ");
			if(d==1) {
				
			a.setNombre(produc[0]);
			a.setDescripcion(produc[1]);
			a.setcant(Integer.valueOf(produc[2]));
			a.setPrecio(Integer.valueOf(produc[2]),Double.valueOf(produc[3]));
			
					}
			else if(d==2){
			b.setNombre(produc[0]);
			b.setDescripcion(produc[1]);
			b.setcant(Integer.valueOf(produc[2]));
			b.setPrecio(Integer.valueOf(produc[2]),Double.valueOf(produc[3]));
				
			}
			else if(d==3) {
			c.setNombre(produc[0]);
			c.setDescripcion(produc[1]);
			c.setcant(Integer.valueOf(produc[2]));
			c.setPrecio(Integer.valueOf(produc[2]),Double.valueOf(produc[3]));	
				
			}
			d++;
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

		
		itemCarrito har = new itemCarrito(a.getNombre(), a.getDescripcion(), a.getcant(), a.getPrecio(), 1);
		itemCarrito lec = new itemCarrito(b.getNombre(), b.getDescripcion(), b.getcant(), b.getPrecio(), 1);
		itemCarrito car = new itemCarrito(c.getNombre(), c.getDescripcion(), c.getcant(), c.getPrecio(), 3);
		
		Carrito Carrito = new Carrito(har, lec, car);
		//Clase que aplica descuento del 50% a un item, si dos items tienen el mismo codigo, es decir que al haber dos en cantidad, uno queda gratis;
		//Se debería aplicar el descuento al precio de un producto y no al total (cantidad*precio). Lo re suelvo y subo a github
		Descuento desc = new Descuento(har,lec,car);
		
		System.out.println("El precio del carrito es:"+Carrito.costoFinal());
		
	}



}
