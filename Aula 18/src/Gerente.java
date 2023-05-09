import java.util.ArrayList;

public class Gerente extends Funcionario implements Autenticada{
	
	private String credencial;
	private String setor;
	private int senha;
	
	public Gerente() {
		
	}
	
	public Gerente(String nome, String cpf, double salario, String credencial, String setor, int senha) {
		super(nome, cpf, salario);
		this.credencial = credencial;
		this.setor = setor;
		this.senha = senha;
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
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double Bonificacao() {
		return getSalario() * 0.15;
	}
	
	public String toString() {
		return super.toString() + "\nCredencial: " + credencial + "\nSetor: " + setor;
	}

	public boolean autentica(int senha) {
		ArrayList<String> setores = new ArrayList<String>();
		setores.add("RH");
		setores.add("ADM");
		if(this.senha == senha && setores.contains(setor)) {
			return true;
		}
		return false;
	}
}
