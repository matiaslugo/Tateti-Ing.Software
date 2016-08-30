package TDD;

public class Juego {
	
	Tablero tablero;

	public Juego(){
		this.tablero = new Tablero();
	}
	
	public String estado(){
		return this.tablero.estadoActual();
	}

	public boolean tableroVacio() {
		
		return tablero.estaVacio();
	}

	public void marcar(String string,int i) {
		tablero.marcar(string,i);
		
	}
	
	
}
