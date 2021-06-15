package br.com.fuctura;

public class TrabalhandoComStrings {
	
	public static void main(String[] args) {
		
		//tipos primitos? Usa ==
		
		StringBuilder sb;
		
		String jogador1 = "Ronaldo FenômenO";
		String R10 = "Ronaldo Fenômeno";
		
		//Deivson, equals - equals
		//Jailton - equalsIgnoreCase - ignorar maiúsculo e minúsculo
		//Arm, Igor, Joao, Petro - ==
				
		if(jogador1.equals(R10) ) {
			System.out.println("O " + jogador1 + " é penta campeão com a seleção Brasileira!");
		}
		
		jogador1 = R10;
		if(jogador1 == R10) {
			System.out.println("Estão apontando para a mesma variável");
		}
		
		jogador1 = jogador1 + " R10";
		for (int i = 0; i < 10; i++) {
			jogador1 = " R10 " + i;
			System.out.println(jogador1);
		}
	}
}
