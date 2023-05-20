import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteIMC {
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		double altura, peso, IMC;
		try {
			System.out.println("Calcule o seu IMC: ");
			System.out.println("Informe seu peso: ");
			peso = in.nextDouble();
			System.out.println("Informe sua altura:"); 
			altura = in.nextDouble();
			if(altura == 0) {
				throw new ArithmeticException();
			}
			else {
				IMC = peso/Math.pow(altura, 2);
				System.out.println("Seu IMC é: " + IMC);
			}
		}
		catch(InputMismatchException i) {
			System.out.println("Esse valor não é valido! " + i.getMessage());
			//System.out.println(i.toString());
		}
		catch(ArithmeticException a) {
			System.out.println("Divisão por zero! ");
			//System.out.println(a.toString());
		}

		
	}
}
