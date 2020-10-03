
public abstract class Raza {

	protected double vida;
	protected double rangoCM;
	protected double da�oBase;
	protected String arma;
	protected String estado;
	protected Punto posicion;
	
	
	
	

	

	public Raza(double vida, double rangoCM, double da�oBase, String arma, Punto posicion) {
		super();
		this.vida = vida;
		this.rangoCM = rangoCM;
		this.da�oBase = da�oBase;
		this.arma = arma;
		this.estado = "normal";
		this.posicion = posicion;
	}

	public abstract void atacar(Raza objetivo);
	
	public abstract void recibirAtaque(Raza atacante);
	
	public abstract void descansar();
	
	public double getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public double getRangoCM() {
		return rangoCM;
	}

	public void setRangoCM(int rangoCM) {
		this.rangoCM = rangoCM;
	}

	public double getDa�oBase() {
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
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Punto getPosicion() {
		return posicion;
	}

	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}
	
	
	
	

}
