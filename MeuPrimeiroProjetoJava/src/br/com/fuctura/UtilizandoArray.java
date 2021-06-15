package br.com.fuctura;

import java.util.Scanner;
import br.com.fuctura.diversos.Fuctura;

public class UtilizandoArray {
	public static void main(String[] args) {
		
		Scanner entradaDoUsuario = new Scanner(System.in);
		
		//declarei meu array
		String [] nomesDosAlunos; //1 linha para declarar
		double [] notasDosAlunos;
		int [] idadesDosAlunos = new int[5]; //declara e inicializa na mesma linha
		
		//criar meu array
		nomesDosAlunos = new String[5]; //1 linha para criar
		notasDosAlunos = new double[5];
		
		//while e for?
		//n = 10
			//x      				//(n-1) = 9
		// [0,1,2,3,4] 
		
		idadesDosAlunos[0] = 1;
		idadesDosAlunos[1] = 0;
		idadesDosAlunos[2] = 1;
		idadesDosAlunos[3] = 0;
		idadesDosAlunos[4] = 1;
		
		
		for(int contador = 0 ; contador < 5 ; contador = contador + 1) {
			
			if((contador % 2) == 0) {
				idadesDosAlunos[contador] = 1; 
			}else {
				idadesDosAlunos[contador] = 0;
			}
				
			System.out.println(contador);
		}
		
		System.out.println(idadesDosAlunos[4]); //qual é o valor?
		//
	}
}
