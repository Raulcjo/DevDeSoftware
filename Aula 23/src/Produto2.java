
public class Produto2 {
	
	private String nome;
	private double valorUnit;
	private int qtd;
	
	public Produto2() {
		
	}
	
	public Produto2(String nome, double valorUnit, int qtd) {
		this.nome = nome;
		this.valorUnit = valorUnit;
		this.qtd = qtd; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public String toString() {
		return "\nNome: " + nome + "\nValor das unidade: " + valorUnit + "\nQuantidade: " + qtd 
				+ "\nValor de estoque do produto: " + (qtd * valorUnit);
	}
	
}
