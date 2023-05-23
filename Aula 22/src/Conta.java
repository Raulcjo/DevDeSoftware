import java.util.Scanner;

public class Conta {
	
	private double valorSaldo;
	
	public Conta() {
		
	}
	
	public Conta(double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}

	public double getValorSaldo() {
		return valorSaldo;
	}

	public void setValorSaldo(double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}
	
	public double Depositar(double dep) {
		Scanner in = new Scanner(System.in);
		dep = 0;
		System.out.println("Informe o valor do depósito: ");
		dep = in.nextDouble();
		valorSaldo += dep; 
		System.out.println("Seu novo saldo é: ");
		return valorSaldo;
		
	}
	
	public double Sacar(double sac) {
		Scanner in = new Scanner(System.in);
		sac = 0;
		try {
			System.out.println("Informe o valor do saque: ");
			sac = in.nextDouble();
			if(valorSaldo >= sac) {
				valorSaldo -= sac;
				System.out.println("Seu novo saldo é: ");
			}
			else {
				throw new ExceptionConta(valorSaldo);
			}
		}
		catch(ExceptionConta c) {
			System.out.println("To String: " + c.toString());
			System.out.println("Get messsage: " + c.getMessage());
		}
		return valorSaldo;
	}
	
}
