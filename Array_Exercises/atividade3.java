package aula06_10;

import java.util.Scanner;

// Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui
public class atividade3 {
	public static void main(String[] args) {
//DECLARAÇÃO DE MATRIZ E VARIAVEIS
		int matriz[][]=new int[3][3];
		int cont=0;
		Scanner scan = new Scanner(System.in);
//PREENCHIMENTO DA MATRIZ
			for(int linha=0;linha<3;linha++) {
				for(int coluna=0;coluna<3;coluna++) {
					System.out.printf("%d linha, %d coluna =", linha+1,coluna+1);
					matriz[linha][coluna]=scan.nextInt();
					
				}
			}
//CONTAR OS MAIORES QUE 10
			for(int linha=0;linha<3;linha++) {
				for(int coluna=0;coluna<3;coluna++) {
					if(matriz[linha][coluna]>10) {
						cont++;
					}
				}
			}		
			System.out.printf("A MATRIZ TEM %d NÚMEROS MAIORES QUE 10", cont);
	}
	
}
