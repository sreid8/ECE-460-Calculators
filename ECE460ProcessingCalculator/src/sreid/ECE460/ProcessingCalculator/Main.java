package sreid.ECE460.ProcessingCalculator;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter lambda: ");
		double lambda = keyboard.nextDouble();
		System.out.println("Enter Sd: ");
		double Sd = keyboard.nextDouble();
		double P0 = calculateP0(lambda, 1/Sd);
		double U = calculateU(P0);
		double P1 = calculatePn(lambda,1/Sd,P0,1);
		double P2 = calculatePn(lambda,1/Sd,P0,2);
		double nBar = calculateNBar(U);
		double X = calculateThroughput(1/Sd,U);
		double R = calculateR(lambda,1/Sd);
		keyboard.close();
		
		System.out.println("u: " + U);
		System.out.println("P0: " + P0);
		System.out.println("P1: " + P1);
		System.out.println("P2: " + P2);
		System.out.println("N Bar: " + nBar);
		System.out.println("Throughput: " + X);
		System.out.println("R: " + R);
		
	}
	
	public static double calculateP0(double lam, double mew) {
		return (1-(lam/mew));
	}
	
	
	public static double calculateU(double P0) {
		return (1-P0);
	}
	
	public static double calculatePn(double lam, double mew, double P0, int n) {
		return (Math.pow((lam/mew), n)*P0);
	}
	
	public static double calculateNBar(double u) {
		return (u/(1-u));
	}
	
	public static double calculateThroughput(double mew, double u) {
		return (mew*u);
	}
	
	public static double calculateR(double lam, double mew) {
		return (1/(mew-lam));
	}
}
