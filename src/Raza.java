
public abstract class Raza {

	private int vida;
	private int rangoCM;
	private int da�oBase;
	private String arma;
	private State estado;
	
	public void  atacar(Raza objetivo){
		this.estado.atacar(objetivo);
	}
	
	public void recibirAtaque(Raza atacante) {
		this.estado.recibirAtaque(atacante);
	}
	
	public abstract void descansar();
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getRangoCM() {
		return rangoCM;
	}

	public void setRangoCM(int rangoCM) {
		this.rangoCM = rangoCM;
	}

	public int getDa�oBase() {
		return da�oBase;
	}

	public void setDa�oBase(int da�oBase) {
		this.da�oBase = da�oBase;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}
	
	

}
