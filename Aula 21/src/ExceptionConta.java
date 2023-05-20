
public class ExceptionConta extends Exception{
	private double saldo;
	
	public ExceptionConta() {
		
	}
	
	public ExceptionConta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Saldo insuficiente para o saque (saldo: R$ " + saldo;
	}
	
	public String getMenssage() {
		return "Saldo insuficiente";
	}
	
}
