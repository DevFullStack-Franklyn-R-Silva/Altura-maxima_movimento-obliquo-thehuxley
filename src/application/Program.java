package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double radianos = sc.nextDouble();
		double velocidade = sc.nextDouble();
		double gravidade = sc.nextDouble();

		velocidade = Math.pow(velocidade, 2);

		double graus = radianos * (Math.PI / 180);
		double senTheta = Math.sin(graus);			
		double senTheta2 = Math.pow(senTheta, 2);
		
		double x = velocidade * senTheta2;
		gravidade = gravidade *2;
		double h = x /gravidade;
		System.out.println(h);
		
		
		
		sc.close();
	}

}
