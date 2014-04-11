package ar.edu.utn.frba.dds.macowins;

public class Sombrero extends Prenda {

	int coeficienteDeMetrosexualidad;
	
	public Sombrero(Marca marca, int coeficienteDeMetrosexualidad) {
		super(marca);
		this.coeficienteDeMetrosexualidad = coeficienteDeMetrosexualidad;
	}
	
	@Override
	protected int precioBaseDeLaPrenda() {
		return 150 + this.coeficienteDeMetrosexualidad;
	}

}
