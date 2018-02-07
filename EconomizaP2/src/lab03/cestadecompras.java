package lab03;

public class cestadecompras {
	public class CestaDeCompras {
		private Produto[] produtos;
		private int indiceControle;

		public CestaDeCompras() {
			this.produtos = new Produto[10];
			this.indiceControle = 0;
		}

		private void dobraArray() {
			Produto[] novaArray = new Produto[produtos.length * 2];
			System.arraycopy(produtos, 0, novaArray, 0, produtos.length);
			produtos = novaArray;
		}

		public void adicionaProduto(String nome, int qtd, double preco, String categoria) {
			produtos[indiceControle] = new Produto(nome, qtd, preco, categoria);
			indiceControle += 1;
			if (indiceControle >= produtos.length) {
				dobraArray();
			}
		}

		public int getTotalProdutos() {
			return indiceControle;
		}
		public double getTotalPorCategoria(String categoria){
			double total = 0;
			for(int i = 0; i < indiceControle; i++){
				if(produtos[i].getCategoria().equals(categoria)){	/*neste momento se faz necessario a criação de um metodo que retorna a categoria do produto*/
					total += produtos[i].getPreco();				/*aqui faz=-se necessaria a criação de outro metodo que retornaria o preço do produto*/
				}
			}return total;
			
		}
		
		public String getCategoria(String categoria){
			return categoria;
		}
		@Override
		public String toString() {
			String resultado ="";
			for (int i = 0; i < indiceControle; i++) {
				resultado += produtos[i] + "; ";
			}
			return resultado;
		}
	}
}
