package Tabuada2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Informe um número para mostrarmos sua tabuada: ");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.print("Informe até que número você quer a tabuada dele: ");
		
		Scanner scanner2 = new Scanner(System.in);
		int y =  scanner.nextInt();
		
		int x = 1;
		int tab = n;
		
		while(x <= y)
		{
			System.out.println(n +" X "+ x +" = "+ x * n);
			x = x + 1;
		}		
			
	}
}
