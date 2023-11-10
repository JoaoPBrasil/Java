package AreaPiramideQuadrada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a altura da Pirâmide(em cm): ");
		int altura = scanner.nextInt();
		
		int base = 29; //aresta da base = 29cm
		
		double areaTriangulo = ((Math.pow(base, 2) * Math.sqrt(3)) / 4) * 4;
		
		System.out.print(areaTriangulo +"\n");
		
		double areaBase = base * base; //area de um quadrado = lado²
		
		System.out.print(areaBase +"\n");
		
		double areaTotal = areaBase + areaTriangulo;
		
		System.out.print("A área da Pirâmide é igual à: "+ areaTotal +" cm");
		
	}

}

