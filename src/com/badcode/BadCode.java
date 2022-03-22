package com.badcode;

public class BadCode {

	public static void main(String[] args) {
	
		Engine engine=new Engine();
		
		Cycle cycle=new Cycle("Cycle","Grey");
		cycle.printDetails();
		System.out.println(cycle.calculateSpeed(100,10,'h','k'));
		cycle.numberOfWheels=2;
		System.out.println(cycle.numberOfWheels);
		cycle.drive();
		cycle.stop();
		cycle.averagePrice(cycle);
		//cycle.refillTank();
		
		
		Bike bike=new Bike("Bike","Blue",engine);
		bike.printDetails();
		System.out.println(bike.calculateSpeed(100,10,'h','k'));
		bike.numberOfWheels=2;
		System.out.println(bike.numberOfWheels);
		bike.start();
		bike.drive();
		bike.stop();
		bike.refillTank();
		bike.averagePrice(bike);
		
		
		System.out.println();
		
		Car car=new Car("Car","White",engine);
		car.printDetails();
		System.out.println(car.calculateSpeed(100,10,'m','m'));
		car.numberOfWheels=4;
		System.out.println(car.numberOfWheels);
		car.numberOfDoors=4;
		System.out.println(car.numberOfDoors);
		car.openDoors();
		car.start();
		car.drive();
		car.stop();
		car.refillTank();
		car.averagePrice(car);
		
		
		System.out.println();
		
		Truck truck=new Truck("Truck","Brown",engine);
		truck.printDetails();
		System.out.println(truck.calculateSpeed(100,10,'s','m'));
		truck.numberOfWheels=4;
		System.out.println(truck.numberOfWheels);
		truck.numberOfDoors=2;
		System.out.println(truck.numberOfDoors);
		truck.openDoors();
		truck.start();
		truck.drive();
		truck.stop();
		truck.refillTank();
		truck.averagePrice(truck);
		
		System.out.println();
		
	}

}
