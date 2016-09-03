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
			estaVacio = !(casilleros.get(i).ocupado());
		}
		return estaVacio;
	}

	public void marcar(String string, int i) throws TatetiException {
		if(this.casilleros.get(i).ocupado()){
			throw new TatetiException();
		}
		else{
			this.casilleros.get(i).numeroJugador=string;
			this.actualizarEstado(string);
		}
	}

	private void actualizarEstado(String string) {
		
		switch(this.celdasOcupadasPorJugador(string)){
		case " 012" : this.estado = "Ganado";
		case " 345" : this.estado = "Ganado";
		case " 678" : this.estado = "Ganado";
		case " 036" : this.estado = "Ganado";
		case " 147" : this.estado = "Ganado";
		case " 258" : this.estado = "Ganado";
		case " 048" : this.estado = "Ganado";
		case " 247" : this.estado = "Ganado";
		}
	}
	
	private String celdasOcupadasPorJugador(String string ) {
		String res=" ";
		for(int i=0;i<9;i++){
			if(casilleros.get(i).numeroJugador==string){
				String val = String.valueOf(((casilleros.get(i).numero)));
				res +=val;
			}
		}
		return res;
	}
	
	
	
}
