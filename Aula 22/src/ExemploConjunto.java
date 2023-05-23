import java.util.HashSet;
import java.util.Iterator;

public class ExemploConjunto {
	public static void main(String [] args) {
		HashSet<String> cargos = new HashSet<String>();
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Analista de TI");
		System.out.println(cargos);
		
		//Como varrer em HashSet - maneira 1:
		for(String cargo: cargos) { // para cada elemento faça alguma coisa
			System.out.println("Cargo: "+ cargo);
		}
		
		//Como varrer em HashSet com Iterator - maneira 2:
		Iterator<String> elemento = cargos.iterator();
		
		while(elemento.hasNext()) {
			System.out.println("Elemento atual: " + elemento.next());  
		}
		
	}
}
