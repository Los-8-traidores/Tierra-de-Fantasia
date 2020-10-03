
public class Nortaichian extends Raza {

	public Nortaichian(Punto posicion) {
		super(119, 300, 43, "katana", posicion);

		// TODO Auto-generated constructor stub
	}

	public void atacar(Raza objetivo) {
		if (this.posicion.distaciaEntrePuntos(objetivo.posicion) < this.rangoCM) {
			objetivo.recibirAtaque(this);
			if (this.vida > 119 - 119 * 0.02) {
				this.vida += this.vida * 0.02;
			}
		}

	}

	public void recibirAtaque(Raza atacante) {
		this.vida -= atacante.dañoBase;	
	}
	
	public void descansar() {
		if (this.vida + 119/2 >  119) {
			this.vida = 119; 
		}

	}
	
}
