package com;

class Bike{

	int bikeNumber =3846;
	String bikecompany ="platina";
	String bikecolor ="black";
}

class Car{
	String carcolor ="white";
	int carnumber =6867;
	short carseat =5;
	String carcompany ="fronx";
}


public class object{
	public static void main(String[] args)
	{
	Bike b1 = new Bike();
	System.out.println("bike number is" + b1.bikeNumber);
	System.out.println("bike company is" + b1.bikecompany);
	System.out.println("bike color is" + b1.bikecolor);
	Car c1 = new Car();
	System.out.println("car number is" + c1.carnumber);
	System.out.println("car seats is" + c1.carseat);
	System.out.println("car company is" + c1.carcompany);
	
}
}