import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1 {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> palavras = new HashMap<String, Integer>();
		String frase;
		System.out.println("Informe uma frase: ");
		frase = input.nextLine();
		String [] aux = frase.split(" ");
		for(int i = 0; i < aux.length; i++) {
			if (palavras.containsKey(aux[i])) {
				int valor = palavras.get(aux[i])+1;
				palavras.replace(aux[i], valor);
			}
			else {
				palavras.put(aux[i], 1);
			}
		}
		Set<String> chaves = palavras.keySet();
		System.out.println("Palavras\tQuantidade de ocorrências\n");  
		for(String palavra: chaves) {
			System.out.println(palavra + "\t" + "\t" + palavras.get(palavra));
		}
	}
}
