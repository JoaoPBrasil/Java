package verificaMes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Informe um mes (em formato numerico) para verificarmos quantos dias ele tem: ");
		
		int mes = scanner.nextInt();
		
		if(mes < 12)
		{
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) 
			{
				System.out.print("O mes tem 31 dias!");
			}
			else 
			{
				if (mes == 2)
				{
					System.out.print("O mes tem 29 dias!");
				}
				else 
				{
					System.out.print("O mes tem 30 dias!");
				}
			}
		}
		else
		{
			System.out.print("Mes inválido!");
		}
		
	}

}
