package contadorSenha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a senha: ");
		int senha = scanner.nextInt();
		
		
		int contador = 0;
		int n = 5;
		while (contador < 5) {
			System.out.print("\nInsira a senha para login: ");
			int tentativa = scanner.nextInt();
			if(tentativa == senha)
			{
				System.out.print("Senha correta! Seja bem vindo!");
				contador = 5;
			}
			else
			{
				n = n - 1;
				System.out.print("Senha incorreta! Você tem mais " + n + " tentativas!");
				contador = contador + 1;
			}
		}
	}

}
