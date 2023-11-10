package InssTaxa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Informe seu salário por mês para calcularmos a taxa do INSS que você irá pagar: \n");
		
		Scanner scanner = new Scanner(System.in);
		float sal = scanner.nextFloat();
		
		double taxa = 0;
		
		if (sal < 1000)
		{
			System.out.print("Isento da taxa do INSS!");
		}
		else if (sal > 1000 && sal <= 1500)
		{
			taxa = sal * 0.1;
			System.out.print("Sua taxa é de: "+ taxa +" reais");
		}
		else if (sal > 1501 && sal <= 2000)
		{
			taxa = sal * 0.15;
			System.out.print("Sua taxa é de: "+ taxa +" reais");
		}
		else if (sal > 2000)
		{
			taxa = sal * 0.20;
			System.out.print("Sua taxa é de: "+ taxa +" reais");
		}
		
	}

}
