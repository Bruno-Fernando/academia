package CompraLojaoP2;

import java.util.Scanner;

public class CompraLojaoP2 {
	public static Scanner input = new Scanner (System.in);
	public static double preco = 1.99;
	
	public static void RealizarCompra(){
		System.out.printf("\nDigite a quantidade de produtos diferentes que será comprada: ");
		
		int total = input.nextInt();
		input.nextLine();
		
		System.out.println("-- Cadastro de produtos --");
		
		String[] NomeProduto = new String[total];
		int[] QuantidadeProduto = new int[total];
		float cont = 0;
		
		for (int i = 0; i < total; i++){
			System.out.printf("Nome do produto %d: ", i+1);
			NomeProduto[i] = input.nextLine();
			
			System.out.printf("Quantidade de %s: ", NomeProduto[i]);
			QuantidadeProduto[i] = input.nextInt();
			cont += QuantidadeProduto[i];
			input.nextLine();
		}
		
		System.out.println("­­-- Cadastro Concluído --");
		System.out.println("A sua compra foi:");
		
		for (int i = 0; i < total; i++){
			System.out.printf("%d %s (%.0f%%)\n", QuantidadeProduto[i], NomeProduto[i], ((QuantidadeProduto[i]/cont)*100));
		}
		System.out.println("Total de produtos: " + cont);
		System.out.printf("Total gasto: %.2f", cont*preco);
		System.out.println();
	}
	
	public static void MudarPrecoBase(){
		System.out.print("\nDigite o novo valor: ");
		preco = input.nextDouble();
	}

}