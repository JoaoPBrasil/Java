package switchCaseAndWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		
		while(contador < 3);
		{

			System.out.println("Escolha uma dos times abaixo: ");
			System.out.println();
			System.out.println();
			System.out.println("1 - Comemoração CR7");
			System.out.println("2 - Comemoração Messi");
			System.out.println("3 - Dança do robô");
			System.out.println("4 - Comemoracao do Vini Jr.");
			
			System.out.print("\nDigite sua escolha: ");
			
			Scanner scanner= new Scanner(System.in);
			int escolha = scanner.nextInt();
			
			switch (escolha)
			{
				case 1:
					System.out.print("Comemoracao do Cr7 foi a escolhida!");
					break;
				case 2:
					System.out.print("Comemoracao do Messi foi a escolhida!");
					break;
				case 3:
					System.out.print("Danca do Robô foi a escolhida!");
					break;
				case 4:
					System.out.print("Comemoracao do Vini Jr. foi a escolhida!");
					break;
				default:
					System.out.print("Opcao Invalida!");
					break;
				
			}
			
			contador++;
		}
	}
}

