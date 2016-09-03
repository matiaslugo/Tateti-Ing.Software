package TDD;

public class Juego {
	
	private Tablero tablero;

	public Juego(){
		this.tablero = new Tablero();
	}
	
	public String estado(){
		return this.tablero.estadoActual();
	}

	public boolean tableroVacio() {
		
		return tablero.estaVacio();
	}

	public void marcar(String string,int i) throws TatetiException {
		tablero.marcar(string,i);
		
	}

	public void setTablero() {
		this.tablero = new Tablero();		
	}
	
	
}
