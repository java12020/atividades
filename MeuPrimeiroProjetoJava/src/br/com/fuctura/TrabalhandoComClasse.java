package br.com.fuctura;

import java.util.Scanner;

public class TrabalhandoComClasse {
	public static void main(String[] args) {
		
		//tipo nomeDaVariavel
		
		//aluno
		Aluno aluno1;
		Aluno aluno2;
		Aluno aluno3;
		
		Aluno [] turma;
		turma = new Aluno[50000];
		
		//vai alocar na mem�ria espa�o para guardar os atributos
		//vai retornar o endere�o do novo objeto
		aluno1 = new Aluno(); //end-ob1
		
		aluno1.nome = "Jo�o";
		aluno1.celular = "99999";
		aluno1.idade = 20;
		
		String nome;
		Scanner entrada = new Scanner(System.in);
		aluno1.nome = entrada.nextLine();
		
		System.out.println(aluno1.nome);
		
		aluno2 = new Aluno(); //end-ob3
		aluno2.nome = "Rafael";
		
		//end-ob1 -> end-ob3
		aluno1 = aluno2;
		
		System.out.println(aluno1.nome);
		
		//Disciplina
		Disciplina disciplina;
		
		//pagamento
		Pagamento pagamento;
		
		//professor
		Professor professor;
		
	}
}
