package lab03;

public class EconomizaP2 {

	public static void main(String[] args) {
		Input ler = new Input();
		Mercado mercado = new Mercado();
		
		final int CADASTRAR = 1;
		final int VENDER = 2;
		final int IMPRIMIR = 3;
		final int SAIR = 4;
		int opcao;
		
		System.out.println("= = = = Bem-vindo(a) ao EconomizaP2 = = = =");		
		
		do{
			imprimeMenu();
			opcao = ler.leInt();
			
			switch (opcao) {
			case CADASTRAR:
				mercado.cadastraProduto();
				break;
			case VENDER:
				mercado.vendeProduto();
				break;
			case IMPRIMIR:
				//imprime
				break;
			case SAIR:
				System.out.println("Volte Sempre!");
			default:
				System.out.println("Opção invalida.");
			}
		}while(opcao != 4);
		
	}
	
	public static void imprimeMenu(){
		System.out.println("\nDigite a opção desejada:");
		System.out.println("1 - Cadastrar um Produto");
		System.out.println("2 - Vender um Produto");
		System.out.println("3 - Imprimir Balanço");
		System.out.println("4 - Sair\n");
		System.out.print("Opção: ");
		
	}
}