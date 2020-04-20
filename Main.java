package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (1 != 2) {
			System.out.println("\n\nx1: ");
			double x1 = input.nextDouble();
			System.out.println("y1: ");
			double y1 = input.nextDouble();
			System.out.println("z1: ");
			double z1 = input.nextDouble();
			System.out.println("x2: ");
			double x2 = input.nextDouble();
			System.out.println("y2: ");
			double y2 = input.nextDouble();
			System.out.println("z2: ");
			double z2 = input.nextDouble();
			System.out.println("\nDistance: " + toDistance(x1, y1, z1, x2, y2, z2));
		}
	}
	
	public static double toDistance(double x1, double y1, double z1, double x2, double y2, double z2 ) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
	}

}
