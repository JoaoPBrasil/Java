import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		System.out.print("Informe o salário para calcularmos quantos salarios minimos corresponde: $");
		Scanner scanner = new Scanner(System.in);
		float salario = scanner.nextFloat();
		
		float total = salario / 1320;
		
		float n = total % 1;
		
		if (n > 0.5)
		{
			System.out.print("A quantidade de salarios minimos que o usuario ganha é igual, à aproximadamente: "+ Math.ceil(total) +" salarios minimos.");
		}
		else if (n <= 0.5)
		{
			System.out.print("A quantidade de salarios minimos que o usuario ganha é igual, à aproximadamente: "+ Math.floor(total) +" salarios minimos.");
		}
		
	}

}
