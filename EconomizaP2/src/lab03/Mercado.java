package lab03;

public class Mercado {
	Estoque estoque = new Estoque();
	
	public void cadastraProduto(){
		Input input = new Input();
		String novoCadastro;

		System.out.println("= = = = Cadastro de Produtos = = = =");

		do{
			System.out.print("Digite o nome do produto: ");
			String nome_produto = input.leString();
			
			System.out.print("Digite o preço unitário do produto: ");
			double preco = input.leDouble();
		
			System.out.print("Digite o tipo do produto: ");
			String tipo = input.leString();
			
			Produto produto = new Produto(nome_produto, preco, tipo);
			estoque.insereProduto(produto);
			estoque.contaProdutos();
			estoque.aumentaArray();
			
			System.out.println("\n" + nome_produto + " cadastrado com sucesso.\n");
			
			System.out.print("Deseja cadastrar outro produto? ");
			novoCadastro = input.leString();
			
		}while(novoCadastro.equals("Sim"));
	}
	public void vendeProduto(){
		
	}
}
