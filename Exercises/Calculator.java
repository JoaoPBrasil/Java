package escolherOperacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rod = 0;
		while (rod == 0)
		{
			System.out.println("Seja bem vindo a calculadora! Informe o primeiro numeros para realizar a operação: ");
			
			Scanner scanner = new Scanner(System.in);
			float n1 = scanner.nextFloat();
			
			System.out.println("Informe o segundo numero para a operação: ");
			
			Scanner scanner2 = new Scanner(System.in);
			float n2 = scanner2.nextFloat();
			
			System.out.print("Informe a operação que deseja realizar: \n 1- Soma\n 2- Subtração\n 3- Muliplicaçao\n 4- Divisão\n 5- Sair\n Operação: ");
			
			Scanner scanner3 = new Scanner(System.in);
			int op = scanner3.nextInt();
			
			float res = 0;
					
			switch (op)
			{
				case 1:
					 res = n1 + n2;
					break;
					
				case 2:
					res = n1 - n2;
					break;
					
				case 3:
					res = n1 * n2;
					break;
					
				case 4:
					res = n1 / n2;
					break;
					
				default:
					break;
			}
			
			if (op == 1 | op == 2 | op == 3 | op == 4)
			{
				System.out.print("O resultado da operação é igual a: "+ res);
			}
			else
			{
				System.out.print("Operação Inválida!");
			}
		
			System.out.print("\nDeseja realizar outro calculo?\n 1- Sim\n 2- Não\n Resposta: ");
			
			Scanner scanner5 = new Scanner(System.in);
			int realizar = scanner5.nextInt();
			
			if (realizar == 2)
			{
				rod = 1;
			}

		}
	}

}