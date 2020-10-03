
public class Vainilla extends Raza{
	
	public Vainilla(double vida, double rangoCM, double da�oBase, String arma, Punto posicion) {
		super(vida, rangoCM, da�oBase, arma, posicion);
		// TODO Auto-generated constructor stub
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
		
	}
	
	
}
