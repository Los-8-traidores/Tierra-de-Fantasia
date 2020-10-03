public class Apotonix extends Raza {
	double restaDa�o = 1;

	public Apotonix(Punto posicion) {
		super(98, 18000, 26, "Maza", posicion);
	}

	@Override
	public void atacar(Raza objetivo) {
		if (this.posicion.distaciaEntrePuntos(objetivo.posicion) < this.rangoCM) {
			objetivo.recibirAtaque(this);
			this.da�oBase += 2;
		}
	}

	@Override
	public void recibirAtaque(Raza atacante) {
		if (restaDa�o != 0) {
			this.vida -= atacante.da�oBase - (atacante.da�oBase * restaDa�o);
			restaDa�o = 0;
		} else {
			this.vida -= atacante.da�oBase;
			if (this.vida * 0.75 < 98)
				this.vida += this.vida * 0.25;
		}
	}

	@Override
	public void descansar() {
		restaDa�o = 0.25;
	}
}
