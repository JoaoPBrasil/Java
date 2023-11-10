package Ordenacao;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int aux = 0;
		int i = 0;
		int j = 0;
		int n = 17;
		
		int[] vet = new int[n];

		for(i = 0; i < 17; i++)
		{
			System.out.print("Insira um valor: ");
			Scanner scanner = new Scanner(System.in);
			int numero = scanner.nextInt();
			
			vet[i] = numero;
		}
		
		
		System.out.println(" ");

		for(i = 0; i < 17; i++)
		{
			for(j = 0; j < 16; j++)
			{
				if(vet[j] > vet[j + 1])
				{
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		
		
		System.out.println("Vetor na ordem crescente:");
			for(i = 0; i < 17; i++)
			{
				System.out.print(" "+ vet[i]);
			}
			
			
			
		System.out.print("\nVetor na ordem decrescente:");
		   for (i = 1; i < vet.length; i++) 
		   {
		        for (j = 0; j < i; j++) 
		        {
		            if (vet[i] > vet[j]) 
		            {
		                int aux2 = vet[i];
		                vet[i] = vet[j];
		                vet[j] = aux2;
		            }
		        }
		    }
		   
		   
		    System.out.println("Array em ordem decrescente:");
		    for (int k : vet) 
		    {
		        System.out.print(k + " ");
		    }
	}

}

