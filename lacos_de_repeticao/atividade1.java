package aula05_10;

import java.util.Scanner;
/* Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. */

public class atividade1 {
	public static void main(String[] args) {
		int num; //informando variavel de entrada
		
		Scanner scan =new Scanner(System.in); // Criando classe Scanner para receber o valor da variavel
		
		for(num=1000;num<=1999;num++) { // Iniciando La�o para leitura de numeros de 1000 � 1999
			if(num%11==5) { 			//Testando condi��o imposta
				System.out.printf("Numero: %d\n", num);	//Imprimir os valores que se adequam � condi��o
			}
		}
	}
}
