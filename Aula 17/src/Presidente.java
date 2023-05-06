
public class Presidente extends Funcionario{

	private String executivo;
	private String empresa;
	
	public Presidente() {
		
	}
	
	public Presidente(String nome, String cpf, double salario, String executivo, String empresa) {
		super(nome, cpf, salario);
		this.executivo = executivo;
		this.empresa = empresa;
		
	}
	
	public String getExecutivo() {
		return executivo;
	}

	public void setExecutivo(String executivo) {
		this.executivo = executivo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double Bonificacao() {
		return getSalario() * 0.2;
	}

	public String toString() {
		return super.toString() + "\nEmpresa: " + empresa + "\nExecutivo: " + executivo;
	}
}
