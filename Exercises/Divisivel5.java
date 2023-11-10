package DivisivelPor5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Informe um número para verificarmos se ele é divisível por 5: ");
		
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
				
		if(value % 5 == 0)
		{
			System.out.print("O número é divisível por 5!");
		}
		else
		{
			System.out.print("O número não é divisível por 5 ou é igual a 0!");
		}
	}

}
