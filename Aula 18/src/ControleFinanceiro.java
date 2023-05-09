import java.util.Scanner;

public class ControleFinanceiro {
	
	public void login(Autenticada at) {
		Scanner input = new Scanner(System.in);
		System.out.println("Escreva a senha: ");
		int senha = input.nextInt();
		if(at.autentica(senha) == true) {
			System.out.println("Usuário logado!");
		}
		else {
			System.out.println("Não foi possível logar!"); 
		}
		input.close();
	}
	
}
