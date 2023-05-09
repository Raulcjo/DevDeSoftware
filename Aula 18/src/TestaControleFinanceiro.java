
public class TestaControleFinanceiro {
	public static void main (String [] args) {
		Gerente g = new Gerente("Maria das Neves", "309.232.454-09", 4500, "T6", "RH", 12345);
		ControleFinanceiro cf = new ControleFinanceiro();
		cf.login(g);
	}
}
