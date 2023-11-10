package BolaOito;

import java.util.Random;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int valorGerado = new Random().nextInt(10);
		boolean acertou = false;
		
		while (!acertou)
		{
			System.out.print("Digite um número: ");
			int valorDigitado = scanner.nextInt();
			acertou = valorDigitado == valorGerado;
		}
		
		System.out.println("Parabéns você acertou");
		scanner.close();	
		
	}

}
