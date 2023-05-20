import java.util.Scanner;

public class TesteParImpar {
	public static void main (String [] args) {
		ParImpar p = new ParImpar();
		Scanner in = new Scanner(System.in);
		int numero;
		System.out.println("Informe o número: ");
		numero = in.nextInt();
		p.setnumero(numero);
		p.verificarParImpar();
		
		System.out.println("Informe um outro número: ");
		numero = in.nextInt();
		p.setnumero(numero);
		try {
			p.verificarParImpar2();
		}
		catch(ExceptionParImpar e) {
			System.out.println(e.toString());
		}
	}
}
