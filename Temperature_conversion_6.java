package UNIDAD_2;

import java.util.Scanner;

public class Temperature_conversion_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int celcius;
		double Fahreinheit;
		double Kelvin;
		System.out.println("Enter degrees Celcius");
		celcius=sc.nextInt();
		Fahreinheit= (1.8)*celcius+32;
		Kelvin = celcius + 273.15;
		System.out.println(celcius+ " degrees celcius "+"is equal to "+Fahreinheit+ " degrees Fahreinheit and "+Kelvin+ " degrees kelvin.");
		
sc.close();
	}

}
