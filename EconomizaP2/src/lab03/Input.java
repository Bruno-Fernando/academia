package lab03;

import java.util.Scanner;

public class Input {
	public Scanner input = new Scanner (System.in);
	
	public int leInt(){
		int numero = input.nextInt();
		return numero;
	}
	public String leString(){
		String palavra = input.nextLine();
		return palavra;
	}
	
	public double leDouble(){
		double numero = input.nextDouble();
		input.nextLine();
		return numero;
	}

}
