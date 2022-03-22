package com.goodcode;

public class Car extends VechileWithDoors implements Actions,RefillAction{
	
	private Engine engine;
	public Car(String vechileType,String color,Engine engine)
	{
	 super(vechileType,color);
	 this.engine=engine;
	}
	public void averagePrice() {
		System.out.println("seven lakhs");
	}
	public void start() {
        engine.start();
	}
	public void drive()
	{
		System.out.println("Car is in motion");
	}
	
    public void stop()
    {
    	System.out.println("Car is Stopped");
    }
	@Override
	public void refillTank() {
		// TODO Auto-generated method stub
		System.out.println("fuel is being filled");
		
	}

}
