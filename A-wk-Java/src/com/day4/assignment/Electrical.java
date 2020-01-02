package com.day4.assignment;

public class Electrical {
	int switchesOnHand;
	int switchesToInstall;
	int outletsOnHand;
	int outletsToInstall;
	int junctionBoxesOnHand;
	int junctionBoxesToInstall;
	int spoolsofWire;
	double metersPerSpoolOfWire;
	double lengthRemaining;
	double lengthOfSegment;
	int screwsOnHand;
	int screwsToInstall;
	int circuitBreakersOnHand;
	void runWires(double length) {}
	void installOutlet() {}
	void installJuctionbox() {
		if ((junctionBoxesOnHand >0 && junctionBoxesToInstall >0) && (junctionBoxesOnHand > junctionBoxesToInstall))
		{
			junctionBoxesOnHand = junctionBoxesOnHand -1; 
			junctionBoxesToInstall = junctionBoxesToInstall-1;	
		}
		
		
	}
	
	double cutWire(double lenghtRemaining, double lengthOfSegment)
	{
		return lengthRemaining = lengthRemaining-lengthOfSegment;
	}
	void installElecricalPanel(){}
	void installCircuitBreaker(){}
	void installFixture() {}
	
}

