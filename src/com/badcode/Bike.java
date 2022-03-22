package com.badcode;

public class Bike extends Vechile implements Actions{
	
	private Engine engine;
	public Bike(String vechileType,String color,Engine engine)
	{
	 super(vechileType,color);
	 this.engine=engine;
	}
	public void start() {
	        engine.start();
	    }
	public void drive()
	{
		System.out.println("Bike is in motion");
	}
    public void stop()
    {
    	System.out.println("Bike is Stopped");
    }
    public void refillTank() {
    	System.out.println("Fuel is being filled");
    }

}
