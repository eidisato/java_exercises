package aula05_10;

import java.util.*;

public class atividade2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); //Criando classe Scanner para receber o valor da variavel
		
		int num,x,somapar=0,somaimpar=0; //Variaveis de entrada
		
		for(x=1;x<11;x++) { //Iniciando la�o para leitura
			System.out.printf("Informe um numero do tipo inteiro, maior que 0: ");
			num=scan.nextInt();
			if(num%2==0) { //Teste de condi��o par
				somapar++;
				}
				else // Teste de condi��o Impar
					somaimpar++;
			}
		System.out.printf("Pares: %d\n", somapar);
		System.out.printf("Impares: %d", somaimpar);
	}
}
