
public class ParImpar {
	private int numero;
	
	public ParImpar() {
		
	}
	
	public ParImpar(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setnumero(int numero) {
		this.numero = numero;
	}
	
	public void verificarParImpar() { // Faz a função de captura
		try {
			if(numero % 2 == 0) {
				System.out.println("O número é par");
			}
			else {
				throw new ExceptionParImpar(numero); 
			}
		}
		catch(ExceptionParImpar p){
			System.out.println("To String: " + p.toString());
			System.out.println("Get messsage: " + p.getMessage());
		}
	}
	
	public void verificarParImpar2() throws ExceptionParImpar{ //Delegando a função de captura
		if(numero % 2 == 0) {
			System.out.println("O número é par");
		}
		else {
			throw new ExceptionParImpar(numero); 
		}
	}
	
}
