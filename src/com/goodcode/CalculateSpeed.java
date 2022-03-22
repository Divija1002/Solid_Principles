package com.goodcode;

public class CalculateSpeed {
	
	public double calculateSpeed ( double distance,double time,char timeForm,char distanceForm) {
		if(timeForm=='m')
			 time=time/60;
		 if(timeForm=='s')
			 time=time/3600;
		 if(distanceForm=='m')
			 distance=distance/1000;
		 double speed;
		 speed=distance/time;
		 return speed;
		
	}

}
