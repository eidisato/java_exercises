package aula04_10;
import java.util.*;
public class atividade4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		double raiz, elevado;
//CALCULO DE RAIZ NUMERO PAR, ELEVADO NUMERO IMPAR
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro qualquer: ");
		num=scan.nextInt();
		if(num%2==0) {
			System.out.printf("O numero %d é PAR...",num);
			raiz=Math.sqrt(num);
			System.out.printf("A raiz quadrada de %d é: %.2f...",num, raiz);
		}
		else if(num%2!=0) {
			System.out.printf("O numero %d é IMPAR...",num);
			elevado=Math.pow(num,2);
			System.out.printf("A potencia 2 de %d é: %.2f...",num, elevado);
		}
	}
}