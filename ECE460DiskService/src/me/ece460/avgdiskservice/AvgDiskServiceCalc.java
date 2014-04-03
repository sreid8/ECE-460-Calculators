package me.ece460.avgdiskservice;

/*sDR = ControlTime + SeekRandTime + DiskRevTime + PmissRand
sDS = ControlTime + (1/avgRunTime)*(pMissRand) + (seekRand/avgRunLength) + randomSeekTime
			Tc																	((1/2)+(avgRunLength-1)((1+u)/2)/24) * ((60/diskSpeed)*1000)

u=lambda * sDR
arr rate * timePerArrival
u=lambda / serviceRate

finish calculating sDS
finish calculating sD

repeat u with sD and go twice more to sD.*/

public class AvgDiskServiceCalc {

	public AvgDiskServiceCalc (double rRate, double pRand, double pSeq, double block, double runLengthAvg, double speedR, double rSeek, double rateT, double timeC) {
		reqRate = rRate; 
		lambda = reqRate/1000.0;
		randP = pRand/100.0; 
		seqP = pSeq/100.0; 
		bSize = block; 
		rotSpeed = speedR;
		aRunLength = runLengthAvg; 
		seekR = rSeek; 
		tRate = rateT; 
		tControl = timeC;

	}
	
	public double calcDiskRevTime() {
		//diskRevTime = ((1/2)*(60/rotSpeed)*1000); 
		diskRevTime = 0.5*(60/rotSpeed)*1000;
		return diskRevTime;
	}
	
	public double calcPMissRand() {
		pMissRand = ((bSize/(tRate*1000000))*1000);
		return pMissRand;
	}
	
	public double calcSDR() {
		sDR = tControl + seekR + diskRevTime + pMissRand;
		return sDR;
	}
	
	public double getLambda() {
		return lambda;
	}
	
	public double calcTSS() {
		
		return 0;
	}
	
	public double calcU1() {
		u1 = lambda * sDR;
		return u1;
	}
	
	public double calcu2() {
		u2 = lambda * sd1;
		return u2;
	}
	
	public double calcu3() {
		u3 = lambda * sd2;
		return u3;
	}
	
	public double calcTRS1() {
		//trs1 = ((.5+(aRunLength-1)*((1+u1)/2)/aRunLength))+((60/rotSpeed)*1000);
		trs1 = ((.5+(aRunLength-1)*((1+u1)/2))/aRunLength)*((60/rotSpeed)*1000);
		return trs1;
	}
	
	public double calcTRS2() {
		trs2 = ((.5+(aRunLength-1)*((1+u2)/2))/aRunLength)*((60/rotSpeed)*1000);
		return trs2;
	}
	
	public double calcTRS3() {
		trs3 = ((.5+(aRunLength-1)*((1+u3)/2))/aRunLength)*((60/rotSpeed)*1000);
		return trs3;
	}
	
	public double calcSDS1() {
		sds1 = tControl + (1/aRunLength)*pMissRand + (seekR/aRunLength) + trs1;
		return sds1;
	}
	
	public double calcSDS2() {
		sds2 = tControl + (1/aRunLength)*pMissRand + (seekR/aRunLength) + trs2;
		return sds2;
	}
	
	public double calcSDS3() {
		sds3 = tControl + (1/aRunLength)*pMissRand + (seekR/aRunLength) + trs3;
		return sds3;
	}
	
	public double calcSD1() {
		sd1 = (randP*sDR) + (seqP*sds1);
		return sd1;
	}
	
	public double calcSD2() {
		sd2 = (randP*sDR) + (seqP*sds2);
		return sd2;
	}
	
	public double calcSD3() {
		sd3 = (randP*sDR) + (seqP*sds1);
		return sd3;
	}
	
	//ins
	double reqRate, randP, seqP, bSize, aRunLength, rotSpeed, seekR, tRate, tControl;
	
	//outs
	double diskRevTime, pMissRand, sDR, u1, lambda, trs1, sd1, trs2, u2, sd2, trs3, u3, sd3, sds1, sds2, sds3;
}




