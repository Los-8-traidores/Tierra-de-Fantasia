import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApotonixTest {

	@Test
	void recibeAtaqueTest () {
		Apotonix a1 = new Apotonix(new Punto(0,0));
		Vainilla v1 = new Vainilla(100, 10, 20, "arma", (new Punto(1,1)));
		
		v1.atacar(a1);
		
		assertEquals(98, a1.getVida());
	}
	
	@Test
	void atacaTest () {
		Apotonix n1 = new Apotonix(new Punto(0,0));
		Vainilla v1 = new Vainilla(100, 10, 20, "arma", (new Punto(1,1)));
		
		n1.atacar(v1);
		
		assertEquals(74, v1.getVida());
	}
	
	
}
