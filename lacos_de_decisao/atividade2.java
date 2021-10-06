package aula04_10;

import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
		
	//Ordem Crescente
		Scanner scan=new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("Digite 3 valores: ");
		n1=scan.nextInt();
		n2=scan.nextInt();
		n3=scan.nextInt();
		
		if (n1 <= n2 && n2 <= n3)
	    {
	      System.out.printf("A ordem crescente: %d, %d, %d\n", n1, n2, n3);
	    }
	  else if (n1 <= n3 && n3 <= n2)
	    {
		  System.out.printf("A ordem crescente: %d, %d, %d\n", n1, n3, n2);
	    }
	  else if (n2 <= n1 && n1 <= n3)
	    {
		  System.out.printf("A ordem crescente: %d, %d, %d\n", n2, n1, n3);
	    }
	  else if (n2 <= n3 && n3 <= n1) 
	    {
		  System.out.printf("A ordem crescente: %d, %d, %d\n", n2, n3, n1);
	    }
	  else if (n3 <= n1 && n1 <= n2) 
	    {
		  System.out.printf("A ordem crescente: %d, %d, %d\n", n3, n1, n2);
	    }
	  else /* n3 <= n2 && n2 < n1 */
	    {
		  System.out.printf("A ordem crescente: %d, %d, %d\n", n3, n2, n1);
	    }
			
		
	}
}
	
