package Pto1;

public class Carrito {
	
	private itemCarrito item1;
	private itemCarrito item2;
	private itemCarrito item3;
	
	public Carrito( itemCarrito item1, itemCarrito item2, itemCarrito item3) {
		this.setItem1(item1);
		this.setItem2(item2);
		this.setItem3(item3);
	}
	
	public Double costoFinal() {
		return this.getItem1().getPrecio()+this.getItem2().getPrecio()+this.getItem3().getPrecio();
	}		


	public itemCarrito getItem1() {
		return item1;
	}

	public void setItem1(itemCarrito item1) {
		this.item1 = item1;
	}

	public itemCarrito getItem2() {
		return item2;
	}

	public void setItem2(itemCarrito item2) {
		this.item2 = item2;
	}

	public itemCarrito getItem3() {
		return item3;
	}

	public void setItem3(itemCarrito item3) {
		this.item3 = item3;
	}
	

}