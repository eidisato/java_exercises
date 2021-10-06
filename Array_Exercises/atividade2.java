package aula06_10;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;
//UTILIZAÇÃO DA LISTAGEM DA VARIAVEL
public class atividade2 {
	//Faça um programa que receba 6 números inteiros e mostre: 
	//• Os números pares digitados;  
	//• A soma dos números pares digitados; 
	//• Os números ímpares digitados; 
	//• A quantidade de números ímpares digitados.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		List<Integer> numerosImpares = new ArrayList<>(); //LISTA DE VETORES IMPARES
		List<Integer> numerosPares = new ArrayList<>(); //LISTA DE VETORES PARES

	       int numero, somaPar = 0;//DECLARAÇÃO DE VARIAVEIS
	       
	    //LAÇO PARA INCREMENTAR VALORES PARA O VETOR   
	    System.out.println("Digite 6 numero para analise");
	       for (int i = 0; i < 6; i++) {
	    System.out.printf("Digite: ");
	           numero = scan.nextInt();  

	           
	           //TESTE PARA SE O NUMERO DIGITADO É PAR
	           if (numero % 2 == 0){
	        	   //ADICIONANDO O NUMERO PAR À VARIAVEL PAR, E LISTANDO
	               numerosPares.add(numero);
	               //SOMA DOS NUMEROS PARES
	               somaPar += numero;

	           }else{//TESTE PARA SE O NUMERO DIGITADO É IMPAR
	        	 //ADICIONANDO O NUMERO IMPAR À VARIAVEL IMPAR, E LISTANDO
	               numerosImpares.add(numero);

	           }

	       }
//SAIDA DAS VARIAVEIS E VETORES
	       System.out.println("Números pares digitados: " + numerosPares);

	       System.out.println("Soma dos números pares: " + somaPar);

	       System.out.println("Números ímpares digitados: " + numerosImpares);

	       System.out.println("Quantidade de ímpares digitados: " + numerosImpares.size());        

}
}

