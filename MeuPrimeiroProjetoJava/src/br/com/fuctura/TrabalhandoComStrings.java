package br.com.fuctura;

public class TrabalhandoComStrings {
	
	public static void main(String[] args) {
		
		//tipos primitos? Usa ==
		
		StringBuilder sb;
		
		String jogador1 = "Ronaldo Fen�menO";
		String R10 = "Ronaldo Fen�meno";
		
		//Deivson, equals - equals
		//Jailton - equalsIgnoreCase - ignorar mai�sculo e min�sculo
		//Arm, Igor, Joao, Petro - ==
				
		if(jogador1.equals(R10) ) {
			System.out.println("O " + jogador1 + " � penta campe�o com a sele��o Brasileira!");
		}
		
		jogador1 = R10;
		if(jogador1 == R10) {
			System.out.println("Est�o apontando para a mesma vari�vel");
		}
		
		jogador1 = jogador1 + " R10";
		for (int i = 0; i < 10; i++) {
			jogador1 = " R10 " + i;
			System.out.println(jogador1);
		}
	}
}
