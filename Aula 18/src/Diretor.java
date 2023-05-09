
public class Diretor extends Gerente implements Autenticada{

	private String filiais;
	
	public Diretor() {
		
	}
	
	public Diretor(String nome, String cpf, double salario, String credencial, String setor, String filiais, int senha) {
		super(nome, cpf, salario, credencial, setor, senha);
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
	
	public boolean autentica(int senha) {
		if(getSenha() == senha) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return super.toString() + "\nFilial: " + filiais;
	}
	
}
