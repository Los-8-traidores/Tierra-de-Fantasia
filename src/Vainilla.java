
public class Vainilla extends Raza{
	
	public Vainilla(double vida, double rangoCM, double dañoBase, String arma, Punto posicion) {
		super(vida, rangoCM, dañoBase, arma, posicion);
		// TODO Auto-generated constructor stub
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
		
	}
	
	
}
