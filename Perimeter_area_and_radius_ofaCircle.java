package UNIDAD_2;

import java.util.Scanner;

public class Perimeter_area_and_radius_ofaCircle {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double pi=Math.PI;
	double area;
	double perimeter;
	double radius;
	System.out.println("Enter circle radius");
	radius=sc.nextFloat();
	pi=3.1416;
	perimeter=2*pi*radius;
	area=pi*(radius*radius);
	System.out.println("The circle's perimeter is "+perimeter+" and its area is "+area);
	sc.close();
	
	
	
	

	}

}
