package com;
//another classes access in one class example
//in this example we access classes present one package
import com.emp;
import com.object;
public class impo {
	public static void main(String[] args) {
		Empdetails p1= new Empdetails();
		p1.Insert(101, "pooja", 30000.85f, "softwaredevp", "IT", true);
		p1.display();
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
