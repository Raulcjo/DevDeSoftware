import java.util.ArrayList;
import java.util.Collections;

public class TestaPessoa {
	public static void main (String [] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa("Maria das neves", "112.453.890-90", "10/02/1985");
		Pessoa p2 = new Pessoa("João Miguel Souza", "345.675.908-01", "20/05/2000");
		
		pessoas.add(p1);
		pessoas.add(p2);
		
		System.out.println("Antes da ordenação:\n" + pessoas);
		Collections.sort(pessoas);
		System.out.println("\nDepois da Ordenação:\n" + pessoas);  
		
		
		
	}
}
