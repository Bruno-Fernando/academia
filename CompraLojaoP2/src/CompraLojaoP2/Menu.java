package CompraLojaoP2;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		System.out.println("Bem vindo ao Lojao LP2!");
		Scanner input = new Scanner (System.in);
		
		int opcao = 0;
		
		while (opcao != 3){
			System.out.println("\nMenu Inicial: Digite uma das opções abaixo: ");
				 
			System.out.println("1 ­ Realizar compra.");
			System.out.println("2 ­ Mudar preço base de produtos.");
			System.out.println("3 ­ Sair\n");	
				 
			System.out.print("Opção: ");
			
			opcao = input.nextInt();
			
			if (opcao == 1){
				CompraLojaoP2.RealizarCompra();
			}
			else if (opcao == 2){
				CompraLojaoP2.MudarPrecoBase();
			}
		}
		System.out.println("\nVolte Sempre!");
		input.close();
	}

}
