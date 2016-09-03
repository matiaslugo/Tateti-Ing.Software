package TDD;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TatetiTestCase {
	
	Juego juego1;
	
	@Before
	public void setUp(){
		juego1 = new Juego();
	}
	
	@After
	public void reset(){
		juego1.setTablero();
	}
	
	@Test
	public void testTableroVacio() {
		assertTrue(juego1.tableroVacio());
	}
	
	@Test(expected = TatetiException.class)
	public void testCasilleroEquivocado() throws TatetiException{
		juego1.marcar("O",0);
		juego1.marcar("X",0);
		
		fail();
		}
	
	
	@Test
	public void testEmpate() throws TatetiException {
		juego1.marcar("O",0);
		juego1.marcar("X",1);
		juego1.marcar("X",2);
		assertEquals(juego1.estado(),"Empatado");
	}
	
	@Test
	public void testGanoJugador1() throws TatetiException{
		juego1.marcar("X",0);
		juego1.marcar("X",1);
		juego1.marcar("X",2);
		assertEquals("Ganado",juego1.estado());
	}
	
	
}
