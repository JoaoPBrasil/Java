package Maioridade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Informe a sua idade para verificarmos se você é maior de idade: ");
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if (age < 18)
		{
			System.out.print("Você é menor de idade!");
		}
		else if (age >= 18)
		{
			if (age < 64)
			{
				System.out.print("Você é maior de idade mas ainda não atingiu a senhoridade!");
			}
			else if (age >= 64)
			{
				System.out.print("Você é maior de idade e já atingiu a senhoridade!");
			}
			
		}

	}

}
