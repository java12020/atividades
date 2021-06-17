package br.com.fuctura.entidade;

public class PartidadeDeFutebol {
	
	
	public static void main(String[] args) {
		
		//8 tipos primitivos: byte, short, int, long, float, double, char , boolean
		
		
		//Tipos de dados criados (não primitivos: String, Scanner, Jogador, Celular, Chip, Aluno, Professor, ....) 
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
		
		//Tipo nomeDaVariável
		//Jogador j1; //só guarda endereço de objetos 
		
		//pra conseguir o endereço, eu preciso do NEW.
		/*
		j1 = new Jogador();
		j1.nome = "CR7";
		j1.altura = 2.0;
		j1.idade = 36;
		j1.posicao = "AT";
		*/
	}
}
