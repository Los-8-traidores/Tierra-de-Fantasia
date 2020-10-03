public class Apotonix extends Raza {
	double restaDaño = 1;

	public Apotonix(Punto posicion) {
		super(98, 18000, 26, "Maza", posicion);
	}

	@Override
	public void atacar(Raza objetivo) {
		if (this.posicion.distaciaEntrePuntos(objetivo.posicion) < this.rangoCM) {
			objetivo.recibirAtaque(this);
			this.dañoBase += 2;
		}
	}

	@Override
	public void recibirAtaque(Raza atacante) {
		if (restaDaño != 0) {
			this.vida -= atacante.dañoBase - (atacante.dañoBase * restaDaño);
			restaDaño = 0;
		} else {
			this.vida -= atacante.dañoBase;
			if (this.vida * 0.75 < 98)
				this.vida += this.vida * 0.25;
		}
	}

	@Override
	public void descansar() {
		restaDaño = 0.25;
	}
}
