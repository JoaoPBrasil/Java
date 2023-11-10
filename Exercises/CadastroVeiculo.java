package CadastroVeiculos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroVeiculos = 5;
		String[] veiculos = new String[numeroVeiculos];

		Scanner scanner = new Scanner(System.in);
		System.out.println("Cadastro de Veículos");

		int indice = 0;
		int contador = 0;

		for(indice = 0; indice < numeroVeiculos; indice++)
		{
			System.out.println("Digite o nome do veículo: ");
			String nomeVeiculo = scanner.nextLine();

			veiculos[indice] = nomeVeiculo;
		}

		for(contador = 0; contador < 5; contador++)
		{
			System.out.println(veiculos[contador]);
		}


	}
}
