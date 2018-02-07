import java.util.Scanner;
public class CompraLojaoP2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Lojão LP2!");
		System.out.printf("Digite a quantidade de produtos diferentes que será comprada: ");
		
		int n;
		n = ler.nextInt();		//quantidade de produtos
		
		String[] produtos = new String[n];		//quantidae de strings lidas
		int[] quantidade = new int[n];			//numero de produtos 
		
		System.out.println("­­--Cadastro de Produtos--");
		
		String s;
		int k;
		for (int i = 0; i<n; i++){
			System.out.printf("Nome do Produto %d: ", i+1);
			s = ler.next();
			produtos[i] = s;
			System.out.printf("Quantidade de %s: ", produtos[i]);
			k = ler.nextInt();
			quantidade[i] = k;
		}
		
		System.out.println("--Cadastro Concluido--");
		System.out.println("A sua compra foi:");
		
		for (int i = 0; i<n; i++){
			System.out.println(quantidade[i] +" "+ produtos[i]);
		}
	}
}