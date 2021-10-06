package aula01_10;
import java.util.Scanner;
public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dias,ano,mes,dia;
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Insira quantos dias de vide você tem: ");
		dias=scan.nextInt();
		
		ano=(dias/365);
		mes=((dias%365)/30);
		dia=((dias%365)%30);
		
		System.out.printf("A sua idade é de %d anos, %d meses e %d dias de vida!!!",ano,mes,dia);
		
		
	}

}
