package br.com.fuctura;

public class UtilizandoArgs {
	
	public static void main(String[] args) {
		
		int [] numeros = new int[10];
		
		System.out.println(numeros.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);			
		}
		
	}
	
}
