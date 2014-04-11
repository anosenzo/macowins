package ar.edu.utn.frba.dds.macowins;

public class Zapatos extends Prenda {
	
	int talle;
	
	public Zapatos(Marca marca, int talle) {
		super(marca);
		this.talle = talle;
	}
	
	@Override
	protected int precioBaseDeLaPrenda() {
		return 400 + 5 * this.talle;
	}

}
