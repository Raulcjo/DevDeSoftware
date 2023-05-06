
public class Diretor extends Gerente{

	private String filiais;
	
	public Diretor() {
		
	}
	
	public Diretor(String nome, String cpf, double salario, String credencial, String setor, String filiais) {
		super(nome, cpf, salario, credencial, setor);
		this.filiais = filiais;
	}

	public String getFiliais() {
		return filiais;
	}

	public void setFiliais(String filiais) {
		this.filiais = filiais;
	}

	public double Bonificacao() {
		return getSalario() * 0.18;
	}
	
	public String toString() {
		return super.toString() + "\nFilial: " + filiais;
	}
	
}
