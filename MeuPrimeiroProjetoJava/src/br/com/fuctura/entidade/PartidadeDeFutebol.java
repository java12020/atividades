package br.com.fuctura.entidade;

public class PartidadeDeFutebol {
	
	
	public static void main(String[] args) {
		
		//8 tipos primitivos: byte, short, int, long, float, double, char , boolean
		
		
		//Tipos de dados criados (n�o primitivos: String, Scanner, Jogador, Celular, Chip, Aluno, Professor, ....) 
		Jogador cristiano;
		
		
		Lampada l;
		l = new Lampada();
		
		l.marca = "Osram";
		l.potencia = 100;
		
		Cadeira eric = new Cadeira();//gerado pelo Java por debaixo dos panos
		eric.marca = "Giroflex";
		eric.altura = 0.75;
		Cadeira c2;
		//c2.marca = 
		
		//Tipo nomeDaVari�vel
		//Jogador j1; //s� guarda endere�o de objetos 
		
		//pra conseguir o endere�o, eu preciso do NEW.
		/*
		j1 = new Jogador();
		j1.nome = "CR7";
		j1.altura = 2.0;
		j1.idade = 36;
		j1.posicao = "AT";
		*/
	}
}
