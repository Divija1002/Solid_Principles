package com.goodcode;

public class VechileWithDoors extends VechileWithoutDoors{
	
	public VechileWithDoors(){
	}
	public VechileWithDoors(String vechileType,String color)
	{
	 super(vechileType,color);
	}
	public int numberOfDoors;
	public void openDoors()
	{
		System.out.println("Doors opened");
	}

}
