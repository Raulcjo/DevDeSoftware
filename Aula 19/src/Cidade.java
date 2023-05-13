import java.util.ArrayList;

public class Cidade {

	private ArrayList<EmissaoCarbono> qtd;
	
	public Cidade() {
		ArrayList<EmissaoCarbono> qtd  = new ArrayList<EmissaoCarbono>();
	}
	
	public Cidade(ArrayList<EmissaoCarbono> qtd) {
		this.qtd = qtd;
	}

	public ArrayList<EmissaoCarbono> getqtd() {
		return qtd;
	}

	public void setqtd(ArrayList<EmissaoCarbono> qtd) {
		this.qtd = qtd;
	}
	
	public void Adicionar(EmissaoCarbono e) {
		qtd.add(e);
	}
	
	public void Remove(EmissaoCarbono e) {
		if(qtd.contains(e)) {
			qtd.remove(e);
		}
	}
	
	public double calculaEmissaoMensal() {
		double total = 0; 
		for(int i = 0; i < qtd.size(); i++) {
			total += qtd.get(i).quantidadeEmitida();
		}
		return total;
	}
	
}
