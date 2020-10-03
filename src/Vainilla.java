
public class Vainilla extends Raza{
	
	public Vainilla(int vida, double rangoCM, int da�oBase, String arma, Punto posicion) {
		super(vida, rangoCM, da�oBase, arma, posicion);
	}
	
	public void atacar(Raza objetivo) {
		if (this.posicion.distaciaEntrePuntos(objetivo.posicion) < this.rangoCM) {
			objetivo.recibirAtaque(this);
		}

	}

	public void recibirAtaque(Raza atacante) {
		this.vida -= atacante.da�oBase;	
	}
	
	public void descansar() {
		this.estado="concetrado";
	}
	
	
}
