package ar.edu.utn.frba.dds.macowins;

public class Pantalon extends Prenda {

	int cm2deTelaUsada;
	
	public Pantalon(Marca marca, int cm2deTelaUsada) {
		super(marca);
		this.cm2deTelaUsada = cm2deTelaUsada;
	}

	@Override
	protected int precioBaseDeLaPrenda() {
		return 250 + this.cm2deTelaUsada;
	}

}
