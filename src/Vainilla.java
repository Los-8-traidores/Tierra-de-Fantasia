
public class Vainilla extends Raza{
	
	public Vainilla(int vida, double rangoCM, int dañoBase, String arma, Punto posicion) {
		super(vida, rangoCM, dañoBase, arma, posicion);
	}
	
	public void atacar(Raza objetivo) {
		if (this.posicion.distaciaEntrePuntos(objetivo.posicion) < this.rangoCM) {
			objetivo.recibirAtaque(this);
		}

	}

	public void recibirAtaque(Raza atacante) {
		this.vida -= atacante.dañoBase;	
	}
	
	public void descansar() {
		this.estado="concetrado";
	}
	
	
}
