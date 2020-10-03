public class Punto {
	private double x;
	private double y;

	// Constructor
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getModule() {
		return Math.sqrt(Math.pow(this.x, 2) + (Math.pow(this.y, 2)));
	}

	public double distaciaEntrePuntos(Punto p2) {
		Punto puntoAux = new Punto(p2.x - this.x, p2.y - this.y);
		return puntoAux.getModule();
	}

}