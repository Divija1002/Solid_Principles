package com.badcode;

public class Truck extends Vechile implements Actions{
	
	private Engine engine;
	
	public Truck(String vechileType,String color,Engine engine)
	{
	 super(vechileType,color);
	 this.engine=engine;
	}
	public void start() {
	        engine.start();
	}
	public void drive()
	{
		System.out.println("Truck is in motion");
	}
    public void stop()
    {
    	System.out.println("Truck is Stopped");
    }
	@Override
	public void refillTank() {
		// TODO Auto-generated method stub
		System.out.println("fuel is being filled");
		
	}

}
