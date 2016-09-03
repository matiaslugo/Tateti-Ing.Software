package TDD;

public class Casillero {
	
	int numero;
	String numeroJugador;

	public Casillero(int num,String numJugador){
		this.numero = num;
		this.numeroJugador = numJugador;
	}
	
	public Casillero(int num){
		this.numero = num;
	}

	public boolean ocupado() {
		// TODO Auto-generated method stub
		return this.numeroJugador!=null;
	}
	
	
}
