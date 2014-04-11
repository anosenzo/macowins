package ar.edu.utn.frba.dds.macowins;

public class Camisa extends Prenda {

	protected Camisa(Marca marca) {
		super(marca);
	}

	@Override
	protected int precioBaseDeLaPrenda() {
		return 200;
	}

}
