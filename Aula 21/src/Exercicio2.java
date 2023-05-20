
public class Exercicio2 {
	public void metodo1() {
		System.out.println("Início do método: ");
		metodo2();
		System.out.println("Fim do método!");
	}
	
	public void metodo2() {
		System.out.println("Início do método 2: ");
		int [] vetor = new int[10];
		try {
			for(int i = 0; i < 15; i++) {
				vetor[i] = i;
				System.out.println(i);
			}
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("To string: " + a.toString());
			System.out.println("Get mensage: " + a.getMessage());
		}
		finally {
			System.out.println("Fim do método 2!");
		}
	}
	
}
