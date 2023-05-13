public class Automovel implements EmissaoCarbono{

	public int combustivel;
	public double quilometragem;
	
	public Automovel() {
		
	}
	
	public Automovel(int combustivel, double quilometragem) {
		this.combustivel = combustivel;
		this.quilometragem = quilometragem;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public double quantidadeEmitida() {
		double quant = 0;
		if(combustivel == 1) {
			//gasoline or alcohol;
			quant = 96*quilometragem;
		}
		else if (combustivel == 2) {
			//electric
			quant = 53*quilometragem;
		}
		else if (combustivel == 3) {
			//diesel
			quant = 171*quilometragem;
		}
		else {
			System.out.println("Tipo de combustível não foi definido, não é possível realizar o cálculo.");
		}
		return quant;
	}
	
	public String toString() {
		return "Tipo de combustível: " + combustivel + "Quantidade de km: " + quilometragem;
	}
	
}
