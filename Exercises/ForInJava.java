package projetoLaco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Insira o numero que você deseja" + " o valor fatorial: ");
		
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		int factorial = 1;
		for(int position = 1; position <= value; position ++)
		{
			factorial = factorial * position;
		}
		
		System.out.print(factorial);
		
	}

}
