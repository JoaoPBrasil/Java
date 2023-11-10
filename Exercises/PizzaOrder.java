package pizzaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Olá, seja bem vindo a pizzaria! Informe seu pedido!\n\n Tulipa de chope = R$2,80\n Pizza mista = R$20,00\n Cada cobertura = R$1,50");
		System.out.println();
		System.out.print("Informe o número de pagantes: ");
		
		Scanner scanner6 = new Scanner(System.in);
		int pg = scanner6.nextInt();

		System.out.print("\nNúmero de chopes: ");
		
		Scanner scanner = new Scanner(System.in);
		int ch = scanner.nextInt();
		
		System.out.print("\nNúmero de pizzas mistas: ");
		
		Scanner scanner2 = new Scanner(System.in);
		int pz = scanner2.nextInt();
		
		System.out.print("\nDeseja adicionar cobertura?\n\n 1- Cobertura\n 2- Sem cobertura\n\n Cobertura: ");
		
		Scanner scanner3 = new Scanner(System.in);
		int cob = scanner3.nextInt();
		
		int ncob = 0;
		
		if (cob == 1)
		{
			System.out.println("\nCoberturas disponíveis: \n\n 1- Queijo\n 2- Presunto\n 3- Banana\n 4- Outras\n");
			System.out.print("Informe o número de coberturas: ");
			
			Scanner scanner4 = new Scanner(System.in);
			ncob = scanner4.nextInt();
			
			System.out.print("\nInforme os sabores da cobertura: ");
			
			scanner.nextLine();
			String sab = scanner.nextLine();
		}
		else
		{
			System.out.print("\nSem cobertura então!\n");
		}
		
		double qtdchope = ch * 2.80;
		float qtdpizza = pz * 20;
		double cobertura = ncob * 1.50;
		double total = qtdchope + qtdpizza + cobertura;
		
		
		System.out.println("\n\nSeu pedido foi: "+ ch +" chopes, "+ pz +" pizzas, "+ ncob +" Coberturas adicionais.");
		System.out.println("\nO valor total do pedido foi: "+ total +" reais");
		
		double garcom = total + (total * 0.10);
		double vf = garcom / pg;
		
		System.out.println("\nO número de pagantes é igual à: "+ pg +". Logo, cada um deve pagar: "+ vf +" reais (já com os 10% incluso).");

	}

}
