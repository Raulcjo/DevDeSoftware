import java.util.ArrayList;

public class PessoaTeste {
	public static void main (String [] args) { 
		PessoaFisica p1 = new PessoaFisica("Maria das Neves", "Rua 10 n° 200", "90899-908", "089.234.253-01");
		PessoaJuridica p2 = new PessoaJuridica("Maria Joaquina das Dores", "Rua 7 n° 102", "76897-564", "089.864.453/0001-43");
	
		ArrayList<PessoaAbstrata> pessoas = new ArrayList<PessoaAbstrata>();
	
		pessoas.add(p1);
		pessoas.add(p2);
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i).toString());
		}
	}

}
