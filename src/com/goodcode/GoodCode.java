package com.goodcode;


public class GoodCode {

	public static void main(String[] args) {
		
		PrintDetails print=new PrintDetails();
		CalculateSpeed calc=new CalculateSpeed();
		Engine petrol=new PetroleumEngine();
		Engine diesel=new DieselEngine();
		
		Cycle cycle=new Cycle("Cycle","Grey");
		print.printDetails(cycle);
		System.out.println(calc.calculateSpeed(100,10,'h','k'));
		cycle.numberOfWheels=2;
		System.out.println(cycle.numberOfWheels);
		cycle.drive();
		cycle.stop();
		cycle.averagePrice();
		
		System.out.println();
		
		Bike bike=new Bike("Bike","Black",petrol);
		print.printDetails(bike);
		System.out.println(calc.calculateSpeed(100,10,'h','k'));
		bike.numberOfWheels=2;
		System.out.println(bike.numberOfWheels);
		bike.start();
		bike.drive();
		bike.stop();
		bike.refillTank();
		bike.averagePrice();
		
		
		System.out.println();
		
		Car car=new Car("Car","Blue",petrol);
		print.printDetails(car);
		System.out.println(calc.calculateSpeed(100,10,'m','m'));
		car.numberOfWheels=4;
		System.out.println(car.numberOfWheels);
		car.numberOfDoors=4;
		System.out.println(car.numberOfDoors);
		car.openDoors();
		car.start();
		car.drive();
		car.stop();
		car.refillTank();
		car.averagePrice();
		
		System.out.println();
		
		Truck truck=new Truck("Truck","Brown",diesel);
		print.printDetails(truck);
		System.out.println(calc.calculateSpeed(100,10,'s','m'));
		truck.numberOfWheels=4;
		System.out.println(truck.numberOfWheels);
		truck.numberOfDoors=2;
		System.out.println(truck.numberOfDoors);
		truck.openDoors();
		truck.start();
		truck.drive();
		truck.stop();
		truck.refillTank();
		truck.averagePrice();
		
		System.out.println();
		

	}


}
