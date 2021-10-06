package aula06_10;

import java.util.Scanner;
//Faça um programa que receba 6 números inteiros e mostre: 
//• Os números pares digitados;  
//• A soma dos números pares digitados; 
//• Os números ímpares digitados; 
//• A quantidade de números ímpares digitados.

public class atividade2_teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int A[] = new int[6];
		        int x;
		        int somapar = 0,quantimpar=0;
		        Scanner leia = new Scanner(System.in);

		        for(x=0;x<6;x++) { //LAÇO PARA ALOCAR VALORES DIGITADOS PELO USUARIO DENTRO DO VETOR 
		            System.out.println("Digite um numero:");
		            A[x]=leia.nextInt();
		            }
		        //LAÇO PARA ANALISE E IMPRESSAO DOS NUMEROS PARES
		        System.out.println("os numeros pares");
		            for(x=0;x<6;x++) {
		            if(A[x]%2==0){ // par
		            	//a0,a1,a2
		                    somapar+=A[x];//somapar = a0+a1+a2
		                    System.out.print(" " +A[x]+" /");
		                }
		            }
		          //LAÇO PARA ANALISE E IMPRESSAO DOS NUMEROS IMPARES
		            System.out.println("\nOs numeros impares");
		            for(x=0;x<6;x++) {
		                if(A[x]%2!=0) {
		                    quantimpar++;
		                    System.out.printf(" "+A[x]+ " /");
		                }
		            }
		            
		            
		        System.out.println("\nA quantidade de numeros Impares digitados é: "+quantimpar);
		        System.out.println("\nA soma dos numeros PARES é: "+somapar);

	}
}