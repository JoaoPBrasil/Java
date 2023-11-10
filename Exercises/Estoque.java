package Estoque;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float med = 0;
		float precot = 0;
		int qtdt = 0;
		
		
		int contador = 0;
		while (contador == 0)
		{
			System.out.print("Informe a quantidade de produtos: ");
			
			Scanner scanner = new Scanner(System.in);
			int qtd = scanner.nextInt();
			
			System.out.print("Informe o valor do produto: ");
			
			Scanner scanner2 = new Scanner(System.in);
			float valor = scanner.nextFloat();
			
			float valort = qtd * valor;
			precot = precot + valort;
			qtdt = qtdt + qtd;
			med = precot / qtdt;
			
			System.out.print("Deseja cadastrar outro produto?\n 1- Sim\n 2- Não\n Resposta:");
			
			Scanner scanner3 = new Scanner(System.in);
			int resp = scanner.nextInt();
			
			if (resp == 2)
			{
				contador = 1;
			}
			
			
		}
		
		 float precototal = precot;
		 float media = med;
		
		System.out.print("O valor total do estoque é: "+ precototal +" reais\n");
		System.out.print("A media de precos do estoque é: "+ media +" reais");
		
		
	}

}
