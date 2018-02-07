package lab03;

public class Estoque {
	private Produto[] produtos = new Produto[5];
	private int quantidade_produto = 0; 

	
	public void contaProdutos(){
		this.quantidade_produto +=1;
	}
	
	public void insereProduto(Produto produto){
		produtos[quantidade_produto] = produto;
	}

	public void aumentaArray(){
		if (quantidade_produto == produtos.length) {
		     Produto[] novoArray = new Produto[quantidade_produto * 2];
		     for (int i=0; i < produtos.length; i++) novoArray[i]=produtos[i];
		     produtos = novoArray;
		}

	}
	public void procuraProduto(String nome){
		for (int i = 0; i < quantidade_produto; i++){
			produtos[i].getNome();
		}
	}
}
