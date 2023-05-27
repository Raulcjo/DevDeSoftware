import java.util.HashMap;

public class Estoque2 {
	
	private HashMap<Integer, Produto2> produto;
	
	public Estoque2() {
		produto = new HashMap<Integer, Produto2>();
	}
	
	public Estoque2(HashMap<Integer, Produto2> produto) {
		this.produto = produto;
	}

	public HashMap<Integer, Produto2> getProduto() {
		return produto;
	}

	public void setProduto(HashMap<Integer, Produto2> produto) {
		this.produto = produto;
	}
	
	public void adicionarProduto(Produto2 item) {
		produto.put(produto.size(), item);
	}
	
	public void removerProduto(int id) {
		produto.remove(id);
	}
	
	public double valorDoEstoque() {
		double valorTotal = 0; 
		for(int i = 0; i < produto.size(); i++) {
			double preco = produto.get(i).getValorUnit();
			double quant = produto.get(i).getQtd();
			valorTotal += preco * quant;
		}
		return valorTotal;
	}
	
	public void receberMercadorira(int id, int quant) { 
		quant += produto.get(id).getQtd();
		produto.get(id).setQtd(quant);
	}
	
	public void retirarEstoque(int id, int quant) {
		int sub = produto.get(id).getQtd();
		sub -= quant;
		produto.get(id).setQtd(sub);
	}
	
	public int verificarQuantidadeEstoque(int id) {
		return produto.get(id).getQtd();
	}
	
	public String imprimirEstoque() {
		return "Produtos: " + produto.toString();
	}
	
}
