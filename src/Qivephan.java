public class Qivephan extends Raza {

	final double rangoMinimo = 17;

	int contadorAtaque = 1;

	boolean descanso = false;

	int turnos = 0;

	public Qivephan(Punto posicion) {

		super(132, 35, 49, "Catapulta", posicion);

	}

	@Override

	public void atacar(Raza objetivo) {

		if (descanso == true && turnos < 2) {

			turnos++;

			return;

		}

		turnos = 0;

		descanso = false;

		if (rangoMinimo < this.posicion.distaciaEntrePuntos(objetivo.posicion)
				&& this.posicion.distaciaEntrePuntos(objetivo.posicion) < this.rangoCM) {

			if (contadorAtaque == 1) {

				this.dañoBase *= 3;

				objetivo.recibirAtaque(this);

				this.dañoBase /= 3;

				contadorAtaque++;

			}

			else {

				objetivo.recibirAtaque(this);

				contadorAtaque = 1;

			}

		}

	}

	@Override

	public void recibirAtaque(Raza atacante) {

		if (descanso == false)

			this.vida -= atacante.dañoBase;

		else

			this.vida -= atacante.dañoBase * 0.75;

	}

	@Override

	public void descansar() {

		this.vida = 132;

		descanso = true;

	}

}