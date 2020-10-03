import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NortaichianTest {

	
	@Test
	void recibeAtaqueTest () {
		Nortaichian n1 = new Nortaichian(new Punto(0,0));
		Vainilla v1 = new Vainilla(100, 10, 20, "arma", (new Punto(1,1)));
		
		v1.atacar(n1);
		
		assertEquals(99, n1.getVida());
	}
	
	@Test
	void atacaTest () {
		Nortaichian n1 = new Nortaichian(new Punto(0,0));
		Vainilla v1 = new Vainilla(100, 10, 20, "arma", (new Punto(1,1)));
		
		n1.atacar(v1);
		
		assertEquals(57, v1.getVida());
	}
	
	@Test
	void atacaFueraDeRangoTest () {
		Nortaichian n1 = new Nortaichian(new Punto(0,0));
		Vainilla v1 = new Vainilla(100, 10, 20, "arma", (new Punto(100,100)));
		
		n1.atacar(v1);
		
		assertEquals(100, v1.getVida());
	}
	
	@Test
	void descansaTest () {
		Nortaichian n1 = new Nortaichian(new Punto(0,0));
		Vainilla v1 = new Vainilla(100, 10, 80, "arma", (new Punto(1,1)));
		
		v1.atacar(n1);
		
		n1.descansar();
		assertEquals(98, n1.getVida());
	}
	

}
