package TDD;

public class TatetiException extends Exception {
	
	private String msj;
	
	public void TatetiException(){
		
		this.msj ="El casillero no esta disponible";
	}
	
	public String getMensaje(){
		
		return this.msj;
	}
}
