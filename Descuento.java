package Pto1;

public class Descuento extends Carrito{


	public Descuento( itemCarrito item1, itemCarrito item2, itemCarrito item3)
	{
		super(item1,item2,item3);
		if(item1.getCodigo()==item2.getCodigo() || item1.getCodigo()== item3.getCodigo())
		{
		item1.setPrecio(1,item1.getPrecio()/2);
		}
		else if(item2.getCodigo()==item3.getCodigo())
		{
		item2.setPrecio(1,item2.getPrecio()/2);
		}
	}
}
