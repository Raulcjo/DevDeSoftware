import java.util.ArrayList;
import java.util.Collections;

public class TestaString {
	public static void main (String [] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Paulo");
		nomes.add("Carla");
		nomes.add("Ana");
		nomes.add("João");
		nomes.add("Gustavo");
		
		System.out.println("Antes de ordenação: " + nomes);
		Collections.sort(nomes);
		System.out.println("\nDepois da ordenação: " + nomes);
		
		System.out.println("Busca binária pelo nome João: " + Collections.binarySearch(nomes, "João"));
		System.out.println("Menor Elemento: " + Collections.min(nomes));
		System.out.println("Maior Elemneto: " + Collections.max(nomes));
		Collections.reverse(nomes);
		System.out.println("Lista Invertida: " + nomes); 
		
	}
}
