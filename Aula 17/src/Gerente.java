
public class Gerente extends Funcionario{
	
	private String credencial;
	private String setor;
	
	public Gerente() {
		
	}
	
	public Gerente(String nome, String cpf, double salario, String credencial, String setor) {
		super(nome, cpf, salario);
		this.credencial = credencial;
		this.setor = setor;
	}
	
	public String getCredencial() {
		return credencial;
	}

	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double Bonificacao() {
		return getSalario() * 0.15;
	}
	
	public String toString() {
		return super.toString() + "\nCredencial: " + credencial + "\nSetor: " + setor;
	}
}
