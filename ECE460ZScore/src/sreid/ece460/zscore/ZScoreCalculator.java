package sreid.ece460.zscore;
import java.lang.Math;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ZScoreCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> list = new ArrayList<Double>();
		//get values
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many values?: ");
		int numVals = keyboard.nextInt();
		int i;
		for(i=0;i<numVals;i++) {
			System.out.print("Enter value " + (i+1) + ": ");
			list.add(keyboard.nextDouble());
		} 
		//calculate average
		double average = avgVals(list);
		//calculate std dev
		double stdDeviation = stdDev(list, average);
		//calculate zscores
		double[] zScores = new double[numVals];
		for(i=0;i<list.size();i++) {
			zScores[i] = zScore(list.get(i),stdDeviation,average);
		}
		//return zscores
		System.out.println("Z Scores: ");
		for(i=0;i<zScores.length;i++) {
			System.out.print(zScores[i] + " ");
		}
		
		//zscore for each item
		//std dev calculation (large and small)
		
		keyboard.close();
	}
	
	public static double avgVals(List<Double> items) {
		double runningSum=0;
		int i;
		//average
		for(i=0;i<items.size();i++) {
			runningSum += items.get(i);
		}
		return runningSum/items.size();
	}
	
	public static double stdDev(List<Double> items, double average) {
		
		double runningSum=0;
		int i;
		//std dev
		if(items.size() <=30) {
			for(i=0;i<items.size();i++) {
				runningSum+=((items.get(i)-average)*(items.get(i)-average)); //sum(xi - avg)^2
			}
			runningSum/=(items.size()-1);
			return Math.sqrt(runningSum);
		}
		else {
			for(i=0;i<items.size();i++) {
				runningSum+=((items.get(i)-average)*(items.get(i)-average)); //sum(xi - avg)^2
			}
			runningSum/=(items.size());
			return Math.sqrt(runningSum);
			}
		
	}
	
	
	public static double zScore(double val, double stdDev, double avg) {
		
		return ((val-avg)/stdDev);
	}

}
