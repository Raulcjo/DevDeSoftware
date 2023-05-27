
public class Exercicio2 {
	public static void main (String [] args) {
		Estoque2 e1 = new Estoque2();
		Produto2 p1 = new Produto2("Skol", 3.79, 12);
		Produto2 p2 = new Produto2("Heineken", 4.99, 24);
		e1.adicionarProduto(p1);
		e1.adicionarProduto(p2);
		
		System.out.println(e1.getProduto());
		//e1.removerProduto(0);
		System.out.println("\nEstoque após remover 1 produto: "+ e1.getProduto());
		
		System.out.println("\nCalcular valor de estoque: " + e1.valorDoEstoque());
		e1.receberMercadorira(1, 2);
		System.out.println("\n Recebe mercadoria: " + e1.getProduto());
		e1.retirarEstoque(1, 6);
		System.out.println("\n Retirar mercadoria: " + e1.getProduto());
		System.out.println("\n Verifica quantidade em estoque: " + e1.verificarQuantidadeEstoque(0));
		System.out.println("Imprimindo estoque inteiro: " + e1.imprimirEstoque());
		
	}
}
