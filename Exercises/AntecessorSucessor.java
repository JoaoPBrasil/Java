package antecessor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Informe um número para obter o antecessor e o sucessor deles: ");
		
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		int ant = value - 1;
		
		System.out.print("O antecessor é o: "+ ant);
		
		int suc = value + 1;
		
		System.out.print("\nO sucessor é o: "+ suc);
		
		
	}

}
