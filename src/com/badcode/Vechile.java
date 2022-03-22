package com.badcode;

public class Vechile {
	protected String vechileType;
	protected String color;
	public Vechile(String vechileType,String color)
	{
		this.vechileType=vechileType;
		this.color=color;
	}
	public Vechile(){	
	}
	 public void printDetails() {
		 System.out.println("Vechile Type: "+vechileType);
		 System.out.println("Color: "+color);
	 }
	 public double calculateSpeed ( double distance,double time,char timeForm,char distanceForm) 
	 {
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
	public int numberOfWheels;
	public int numberOfDoors;
	public void openDoors()
	{
		System.out.println("Doors opened");
	}
	//demo purpose
	public void averagePrice(Vechile v)
	{
		if(v instanceof Cycle)
			System.out.println("seven thousand");
		if(v instanceof Car)
			System.out.println("seven lakhs");
		if(v instanceof Bike)
			System.out.println("fifty thousand");
		if(v instanceof Truck)
			System.out.println("ten lakhs");
	}
}
