package TDD;

import java.util.ArrayList;

public class Tablero {
	
	ArrayList<Casillero> casilleros = new ArrayList<Casillero>();
	String estado;

	public Tablero(){
		this.inicializarTablero();
		this.estado = "Empatado";
	}
	
	public void inicializarTablero(){
		
		for(int i=0;i<9;i++){
			casilleros.add(new Casillero(i));
		}
	}
	
	public String estadoActual() {
		return this.estado;
		
	} 

	public boolean estaVacio() {
		boolean estaVacio = true;
		for(int i=0;i<9;i++){
			estaVacio = casilleros.get(i).ocupado();
		}
		return estaVacio;
	}
}
