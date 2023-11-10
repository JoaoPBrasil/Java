package escolhaTime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Escolha uma das opções abaixo como seu time do coracao: ");
		System.out.println();
		System.out.println();
		System.out.println("1 - Athletico Paranaense");
		System.out.println("2 - Coritiba");
		System.out.println("3 - Flamengo");
		System.out.println("4 - Corinthians");
		System.out.println("5 - Outro");
		
		System.out.print("\nDigite o numero do seu time do coracao: ");
		
		Scanner scanner= new Scanner(System.in);
		int escolha = scanner.nextInt();
		
		switch (escolha)
		{
			case 1:
				System.out.print("Seu time do coracao e o Athletico Paranaense!");
				break;
			case 2:
				System.out.print("Seu time do coracao e o Coritiba!");
				break;
			case 3:
				System.out.print("Seu time do coracao e o Flamengo!");
				break;
			case 4:
				System.out.print("Seu time do coracao e o Corinthians!");
				break;
			default:
			{
				System.out.print("Por favor, insira o seu time do coracao: ");
				scanner.nextLine();
				String timeUsuario = scanner.nextLine();
				System.out.println("O seu time do coracao e o " + timeUsuario);
				break;
			}
		}

	}

}
