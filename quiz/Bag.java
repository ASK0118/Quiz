package quiz;

import java.util.Scanner;
public class Bag {
	
	Scanner input = new Scanner(System.in);
	
	
	String brand;
	String color;
	double size;
	String type;
	
	public void setBrand(String brand) {
		System.out.print("Enter the brand: ");
		brand = input.next();
		this.brand = brand;
	}
	
	public void setColor(String color) {
		System.out.print("Enter the color: ");
		brand = input.next();
		this.color = color;
	}
		
	public void setSize(double size) {
		System.out.print("Enter the size: ");
		size = input.nextDouble();
		this.size = size;
	}
	
	public void setType(String type) {
		System.out.print("Enter the type: ");
		type = input.next();
		this.type = type;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getSize() {
		return this.size;
	}
	
	public String getType() {
		return this.type;
	}
	
}
