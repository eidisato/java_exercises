package aula06_10;

import java.util.Scanner;
//Fa�a um programa que receba 6 n�meros inteiros e mostre: 
//� Os n�meros pares digitados;  
//� A soma dos n�meros pares digitados; 
//� Os n�meros �mpares digitados; 
//� A quantidade de n�meros �mpares digitados.

public class atividade2_teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int A[] = new int[6];
		        int x;
		        int somapar = 0,quantimpar=0;
		        Scanner leia = new Scanner(System.in);

		        for(x=0;x<6;x++) { //LA�O PARA ALOCAR VALORES DIGITADOS PELO USUARIO DENTRO DO VETOR 
		            System.out.println("Digite um numero:");
		            A[x]=leia.nextInt();
		            }
		        //LA�O PARA ANALISE E IMPRESSAO DOS NUMEROS PARES
		        System.out.println("os numeros pares");
		            for(x=0;x<6;x++) {
		            if(A[x]%2==0){ // par
		            	//a0,a1,a2
		                    somapar+=A[x];//somapar = a0+a1+a2
		                    System.out.print(" " +A[x]+" /");
		                }
		            }
		          //LA�O PARA ANALISE E IMPRESSAO DOS NUMEROS IMPARES
		            System.out.println("\nOs numeros impares");
		            for(x=0;x<6;x++) {
		                if(A[x]%2!=0) {
		                    quantimpar++;
		                    System.out.printf(" "+A[x]+ " /");
		                }
		            }
		            
		            
		        System.out.println("\nA quantidade de numeros Impares digitados �: "+quantimpar);
		        System.out.println("\nA soma dos numeros PARES �: "+somapar);

	}
}