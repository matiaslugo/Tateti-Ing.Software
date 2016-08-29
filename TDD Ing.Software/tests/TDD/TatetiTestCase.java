package TDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TatetiTestCase {
	
	Juego juego1;
	
	@Before
	public void setUp(){
		juego1 = new Juego();
	}

	@Test
	public void testTableroVacio() {
		assertTrue(juego1.tableroVacio());
	}
	
	
	@Test
	public void testEmpate() {
		assertEquals(juego1.estado(),"Empatado");
	}
	
	@Test
	public void testGanoJugador1() {
		assertEquals(juego1.estado(),"Empatado");
	}
	
	
}
