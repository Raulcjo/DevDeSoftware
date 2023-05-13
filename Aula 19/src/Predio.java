
public class Predio implements EmissaoCarbono{

	public int numeroPessoas;
	public boolean usoEnergiaRenovavel;
	public int numeroLampadas;
	public int numeroArCondicionados;
	
	public Predio() {
		
	}
	
	public Predio(int numeroPessoas, boolean usoEnergiaRenovavel, int numeroLampadas, int numeroArCondicionados) {
		this.numeroPessoas = numeroPessoas;
		this.usoEnergiaRenovavel = usoEnergiaRenovavel;
		this.numeroLampadas = numeroLampadas;
		this.numeroArCondicionados = numeroArCondicionados;
	}

	public int getNumeroPessoas() {
		return numeroPessoas;
	}

	public void setNumeroPessoas(int numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}

	public boolean isUsoEnergiaRenovavel() {
		return usoEnergiaRenovavel;
	}

	public void setUsoEnergiaRenovavel(boolean usoEnergiaRenovavel) {
		this.usoEnergiaRenovavel = usoEnergiaRenovavel;
	}

	public int getNumeroLampadas() {
		return numeroLampadas;
	}

	public void setNumeroLampadas(int numeroLampadas) {
		this.numeroLampadas = numeroLampadas;
	}

	public int getNumeroArCondicionados() {
		return numeroArCondicionados;
	}

	public void setNumeroArCondicionados(int numeroArCondicionados) {
		this.numeroArCondicionados = numeroArCondicionados;
	}

	public double quantidadeEmitida() {
		double quant = 0;
		quant = (14.4*numeroLampadas) + (10*numeroPessoas) + (100*numeroArCondicionados);
		if(usoEnergiaRenovavel == true) {
			return quant/2;
		}
		else {
			return quant;
		}
	}
	
	public String toString() {
		return "Número de pessoas: " + numeroPessoas + "Usa energia renovável: " + usoEnergiaRenovavel
				+ "Quantidade de lâmpadas: " + numeroLampadas + "Número de ar-condiconados: " + numeroArCondicionados;	
	}
	
}
