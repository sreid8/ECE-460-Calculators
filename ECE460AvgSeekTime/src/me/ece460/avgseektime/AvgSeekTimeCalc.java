package me.ece460.avgseektime;

public class AvgSeekTimeCalc {
	
	String [] requests;
	
	public AvgSeekTimeCalc(String reqs) {
		requests = reqs.split(",");
	}
	
	public double calculate(double seekRand) {
		//first one is a seekRand. then if valueOfNext = valueOfCurr+1 then + 0, else +seekRank in a loop
		double current = Double.parseDouble(requests[0]);
		double next = Double.parseDouble(requests[1]);
		double result = seekRand; //first is always a seekRand
		if(next != current+1) {
			result += seekRand;
		}
		int i;
		for(i=1;i<requests.length;i++) {
			current = Double.parseDouble(requests[i]);
			if(i+1<requests.length) {
				next = Double.parseDouble(requests[i+1]);
				if(next != current+1) {
					result += seekRand;
				}
			}
		}
		return result/requests.length;
	}
}
