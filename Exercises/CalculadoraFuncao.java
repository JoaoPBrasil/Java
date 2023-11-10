package Calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a operação que deseja: ");
		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRAÇÃO");
		System.out.println("3 - MULTIPLICAÇÃO");
		System.out.println("4 - DIVISÃO");
		
		int opcao = scanner.nextInt();
		
		System.out.println("Digite o primeiro numero para a operação: ");
		
		float operando1 = scanner.nextFloat();
		
		System.out.print("Digite o segundo numero para a operação: ");
		
		float operando2 = scanner.nextFloat();
		
		float resultado = 0;
		
		switch (opcao)
		{
			case 1:
				
				resultado = somar(operando1, operando2);
				System.out.println(resultado);
				
				break;
					
			case 2:
				
				 resultado = subtrair(operando1, operando2);
				 System.out.println(resultado);
				
				break;
				
			case 3:
				
				 resultado = multiplicar(operando1, operando2);
				 System.out.println(resultado);
				
				break;
			
			case 4:
				
				 resultado = dividir(operando1, operando2);
				 System.out.println(resultado);
				
				break;
				
			default:
				
				break;
		}

		boolean resultadoValidado = validarResultado(resultado);
		
		if(resultadoValidado)
		{
			System.out.println("O resultado é: "+ resultado);
		}
		else
		{
			System.out.println("O resultado não é válido!");
		}
		
		/* ou if (validarResultado(resultado)
		 * {
		 * 
			System.out.println("O resultado é: "+ resultado);
			}
			else
			{
			System.out.println("O resultado não é válido!");
			}
		 */
	}

	private static float somar(float operando1, float operando2)
	{
		 float resultado = operando1 + operando2;
	
		return resultado;
	}
	
	private static float subtrair(float operando1, float operando2)
	{
		 float resultado = operando1 - operando2;
	
		return resultado;
	}
	
	private static float multiplicar(float operando1, float operando2)
	{
		 float resultado = operando1 * operando2;
	
		return resultado;
	}
	
	private static float dividir(float operando1, float operando2)
	{
		 float resultado = operando1 / operando2;
	
		return resultado;
	}
	
	private static boolean validarResultado(float resultado)
	{
		return resultado < 300;
	}
}
