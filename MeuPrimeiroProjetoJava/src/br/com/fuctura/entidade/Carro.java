package br.com.fuctura.entidade;

public class Carro {
	String nome;
	String marca;
	int ano;
	
	//Construtor customizado, não quero o padrão
	//Finalidade = inicializar o objeto criado
	Carro(String nomeDoCarro, String marcaDoCarro, int anoDoCarro){
		System.out.println("Construtor - nomeDoCarro = " + nomeDoCarro);
		System.out.println("Construtor - marcaDoCarro = " + marcaDoCarro);
		System.out.println("Construtor - anoDoCarro = " + anoDoCarro);
		nome = nomeDoCarro; //"Gol G4"
		marca = marcaDoCarro; //"Wolkswagem"
		ano = anoDoCarro; //2021
	}
}
