import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Vamos calcular a quantidade de azulejos para preencher a parede. ");
		
		
		System.out.println("Informe a altura da parede, em metros: ");
		Scanner scanner = new Scanner(System.in);
		float hp = scanner.nextFloat();
		
		System.out.println("Informe a largura da parede, em metros: ");
		Scanner s1 = new Scanner(System.in);
		float lp = scanner.nextFloat();
		
		System.out.println("Agora informe o comprimento do azulejo, em metros: ");
		Scanner s2 = new Scanner(System.in);
		float ca = scanner.nextFloat();
		
		System.out.println("Informe a largura do azulejo, em metros: ");
		Scanner s3 = new Scanner(System.in);
		float la = scanner.nextFloat();
		
		float total = (hp * lp) / (ca * la);
		System.out.println("A quantidade de azulejos é igual à: "+ total);	
	}

}
