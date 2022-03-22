package com.goodcode;

public class Bike extends VechileWithoutDoors implements Actions,RefillAction{
	
	private Engine engine;
	public Bike(String vechileType,String color,Engine engine)
	{
	 super(vechileType,color);
	 this.engine=engine;
	}
	public void averagePrice() {
		System.out.println("fifty thousand");
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
	@Override
	public void refillTank() {
		// TODO Auto-generated method stub
		System.out.println("fuel is being filled");
		
	}

}
