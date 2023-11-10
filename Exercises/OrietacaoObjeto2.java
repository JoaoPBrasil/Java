package poo;

import java.util.Scanner;

import poo.model.Aluno;
import poo.model.Professor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Nome = null, Cpf = null, Email = null, Contato = null, Matricula = null;

		System.out.print("Cadastro de professor: \n");
		
		Professor professor = new Professor();
		professor.setNome(Nome);
		professor.setMatricula(Matricula);
		professor.setEmail(Email);
		
		System.out.print("Informe quantos alunos estaram presentes na turma: \n");
		
		Scanner scanner = new Scanner(System.in);
		int nalunos = scanner.nextInt();
		
		for (int x = 0; x > nalunos; x++)
		{
			Aluno aluno = new Aluno();
			aluno.setNome(Nome);
			aluno.setCPF(Cpf);
			aluno.setEmail(Email);
			aluno.setContato(Contato);
				
		}
		
		
		
		/*nome = scanner.nextLine();
		
		System.out.print("Informe o CPF do aluno: ");
		
		CPF = scanner.nextLine();
		
		System.out.print("Informe o email do aluno: ");
		
		Email = scanner.nextLine();
		
		System.out.print("Informe o contato do aluno: ");
		
		Contato = scanner.nextLine();
		

		Aluno aluno2 = new Aluno();
		aluno2.setNome("João Brasil");
		aluno2.setCPF(Cpf);
		aluno2.setEmail(Email);
		aluno2.setContato(Contato);
		
		Professor professor = new Professor();
		professor.setNome(Nome);
		professor.setMatricula(Matricula);
		professor.setEmail(Email);
		*/

		
	}

}
