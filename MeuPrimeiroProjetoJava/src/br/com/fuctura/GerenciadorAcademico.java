package br.com.fuctura;

import java.util.Scanner;

public class GerenciadorAcademico {
	public static void main(String[] args) {
		Scanner entradaDoUsuario = new Scanner(System.in);
		
		int TAMANHO_DO_ARRAY = 1;
		
		String [] nomeDoAlunos = new String[TAMANHO_DO_ARRAY];
		double [] notaDoAlunos = new double[TAMANHO_DO_ARRAY];
		int []	  idadeDosAlunos = new int[TAMANHO_DO_ARRAY];

		//enter -> \n
		//Maria Josefina\n
		//10\n
		//27\n
		
		//Tabelas ASCII -> \n (enter), \t (t
		
		for(int contador = 0 ; contador < TAMANHO_DO_ARRAY; contador = contador + 1) {
			System.out.println("Digite o nome do Aluno: ");
			nomeDoAlunos[contador] = entradaDoUsuario.nextLine();
			
			System.out.println("Digite a nota do aluno:");
			notaDoAlunos[contador] = entradaDoUsuario.nextDouble();
			
			System.out.println("Digite a idade do aluno: ");
			idadeDosAlunos[contador] = entradaDoUsuario.nextInt();
			
			entradaDoUsuario.nextLine();
			
		}
		
		//imprimir todos de uma vez?
		for(int contador = 0 ; contador < TAMANHO_DO_ARRAY; contador = contador + 1) {
			System.out.println("Nome do aluno digitado foi: " + nomeDoAlunos[contador] + "<---");
			System.out.println("Nota do aluno digitado foi: " + notaDoAlunos[contador] + "<---");
			System.out.println("Idade do aluno digitado foi: " + idadeDosAlunos[contador] + "<---");
			System.out.println("");
		}
	}
}
