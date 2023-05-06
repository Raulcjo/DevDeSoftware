import java.util.ArrayList;

public class FuncionarioTeste {
	public static void main (String [] args) {
		
		Gerente f1 = new Gerente("José Silva", "908.345.898-01", 3500 , "RH", "P1");
		Presidente f2 = new Presidente("Marta Gomes", "897.432.567-90", 9800, "G2", "UltraGás");
		Diretor f3 = new Diretor("Mário Gomes", "504.354.567-01", 6000 , "P1", "TI", "Apucarana");
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		for(int i = 0; i < funcionarios.size(); i++) {
			System.out.println(funcionarios.get(i).toString());
			System.out.println("Bonificação: " + funcionarios.get(i).Bonificacao() + "\n");
		}
		
	}

}
