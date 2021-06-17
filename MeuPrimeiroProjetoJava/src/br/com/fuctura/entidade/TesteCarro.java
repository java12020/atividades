package br.com.fuctura.entidade;

import java.util.Scanner;

public class TesteCarro {
	public static void main(String[] args) {
		System.out.println("Sistema de aluguel de carro");

		Carro[] carros = new Carro[10];
		int ContadorDeCarrosCadastrados = 0;

		// voltar pra cá

		System.out.println("O que deseja fazer?");
		System.out.println("1 - Cadastrar um carro");

		Scanner entrada = new Scanner(System.in);
		int opcaoSelecionada = entrada.nextInt();

		entrada.nextLine();

		// cadastrar carro
		if (opcaoSelecionada == 1) {
			System.out.println("Digite o nome do carro");
			String nomeDoCarro = entrada.nextLine();

			System.out.println("Digite a marca do carro");
			String marcaDoCarro = entrada.nextLine();

			System.out.println("Digite o ano do carro");
			int anoDoCarro = entrada.nextInt();

			// validar....

			Carro c;
			c = new Carro(nomeDoCarro, marcaDoCarro, anoDoCarro);

			System.out.println("Nome: " + c.nome + " Marca: " + c.marca + " Ano: " + c.ano);
			carros[ContadorDeCarrosCadastrados] = c;
			ContadorDeCarrosCadastrados = ContadorDeCarrosCadastrados + 1;
		}

	}
}
