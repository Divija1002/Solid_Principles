package com.goodcode;


public class Cycle extends VechileWithoutDoors implements Actions{
	
	public Cycle(String vechileType,String color)
	{
	 super(vechileType,color);
	}
	
	public void averagePrice() {
		System.out.println("seven thousand");
	}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Cycle is in motion");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Cycle is stopped");
		
	}
	
	

}
