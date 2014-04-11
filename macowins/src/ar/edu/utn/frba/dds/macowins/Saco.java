package ar.edu.utn.frba.dds.macowins;

public class Saco extends Prenda {

	int cantidadDeBotones;
		
	public Saco(Marca marca, int cantidadDeBotones) {
		super(marca);
		this.cantidadDeBotones = cantidadDeBotones;
	}
	
	@Override
	protected int precioBaseDeLaPrenda() {
		
		return 300 + this.cantidadDeBotones * 10;
	}

}
