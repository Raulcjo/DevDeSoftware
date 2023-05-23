import java.util.ArrayList;
import java.util.Collections;

public class TestaInteiros {
	public static void main (String [] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(20);
		numeros.add(50);
		numeros.add(0);
		numeros.add(-10);
		
		ArrayList<Integer> numeros2 = new ArrayList<Integer>();
		numeros2.add(10);
		numeros2.add(60);
		numeros2.add(-1);
		numeros2.add(-11);
		
		
		System.out.println("Antes da Ordenação: " + numeros);
		Collections.sort(numeros); //Ordena os números
		System.out.println("\nDepois da Ordenação: " + numeros);   
		
		System.out.println("\nBusca binário pelo elemento 0: " + Collections.binarySearch(numeros, 80));
		System.out.println("\nConjuntos dijuntos: " + Collections.disjoint(numeros, numeros));
		System.out.println("\nConjuntos dijuntos: " + Collections.disjoint(numeros, numeros2));
		
		numeros.add(20);
		numeros.add(20);
		
		System.out.println("\nFrequência do elemento 20: " + Collections.frequency(numeros, 20));
		System.out.println("\nMenor Elemento: " + Collections.min(numeros));
		System.out.println("\nMaior Elemento: " + Collections.max(numeros)); 
		
		Collections.sort(numeros);
		Collections.reverse(numeros);
		System.out.println("\nInvertendo a lista: " + numeros);

	}
}
