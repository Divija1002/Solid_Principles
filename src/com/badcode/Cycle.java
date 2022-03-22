package com.badcode;

public class Cycle extends Vechile implements Actions{
	
	public Cycle(String vechileType,String color)
	{
	 super(vechileType,color);
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

	@Override
	public void refillTank() {
		throw new Error("error thrown from cycle refillTank method");
	}

}
