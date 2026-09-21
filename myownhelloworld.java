package UNIDAD_2;

import java.util.Scanner;

public class myownhelloworld {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); // always define variables after the Scanner(this part)
	String name;    // use the correct type of variables for defining them like(string, float, double, etc.)
	float c1,c2;         // you always have to define variables 
	double prom;
	System.out.println("write your name: ");
	name=sc.next();                            //this way you ask the user to enter information
	System.out.println("ingrsa calificacion 1: " );
	c1=sc.nextFloat();
	System.out.println("ingresa calificacion 2;");
	c2=sc.nextFloat();
	prom=(c1+c2);
	System.out.print("el promedio de "+ name+ " es: " + prom); // this the way you show the result	
sc.close();
	}

}
