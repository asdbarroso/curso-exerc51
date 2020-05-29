package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Enter restangule width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.printf("AREA : %.2f%n", retangulo.area());
		System.out.printf("PERIMETER : %.2f%n", retangulo.perimeter());
		System.out.printf("DIAGONAL : %.2f%n", retangulo.diagonal());
		
		sc.close();
	}

}
