package vetores;

import java.util.Locale;
import java.util.Scanner;

public class aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um limitador de alturas");
		
		int n = sc.nextInt();
		double[] vect = new double [n]; //Criando um vector com n elementos.
		
		for (int i=0; i<n; i++){
			vect[i] = sc.nextDouble();
			System.out.println("Voce digitou " + vect);
		}
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
				
	   System.out.printf("AVERAGE HEIGHT: %.2f%n",avg);
				 				
	    sc.close();
	}

}
