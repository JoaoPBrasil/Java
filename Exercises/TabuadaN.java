package TabuadaN;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Informe um número para mostrarmos sua tabuada: ");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int x = 1;
		
		while(x <= n)
		{
			System.out.println(x +" X "+ n +" = "+ x * n);
			x = x + 1;
		}		
			
	}
}
