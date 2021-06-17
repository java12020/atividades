package br.com.fuctura;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CadastrarAlunos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("***Sistema de controle academico***");
		
		System.out.println("Digite o nome do aluno:");
	
		Aluno a = new Aluno();
		
		a.nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		System.out.println(a.nome);
	}
}
