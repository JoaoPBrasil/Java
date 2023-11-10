package br.com.unicuritiba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int idade = 0;
		int media = 0;  
		int i;
		int f20 = 0;
		int sexo = 0;
		
		System.out.print("Seja bem vindo ao programa!\n");
		System.out.print("Insira os dados das 10 pessoas: \n");
		
		for (i = 0; i < 10; i++)
		{
			System.out.print("Insira a idade: ");
			idade = scanner.nextInt();
			
			System.out.print("Insira o sexo (1 para masculino e 2 para feminino): ");
			sexo = scanner.nextInt();
			
			media = idade + media;
			
			if (sexo == 2 && idade >= 20)
			{
				f20 = f20 + 1;
			}
			
		}
		
		media = media / 10;

		System.out.print("A média da idade dos 10 participantes é igual à: "+ media);
		System.out.print("\nO total de pessoas do sexo feminino com mais de 20 anos é igual à: "+ f20);
		}

	}
