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
	public void testCasilleroEquivocado() {
		juego1.marcar("O",0);
		juego1.marcar("X",1);
		
		assertTrue(juego1.tableroVacio());
	}
	
	
	@Test
	public void testEmpate() {
		juego1.marcar("O",0);
		juego1.marcar("X",1);
		juego1.marcar("X",2);
		assertEquals(juego1.estado(),"Empatado");
	}
	
	@Test
	public void testGanoJugador1() {
		juego1.marcar("X",0);
		juego1.marcar("X",1);
		juego1.marcar("X",2);
		assertEquals("Ganado",juego1.estado());
	}
	
	
}
