package UNIDAD_2;
// program two made on Wednesday 24-September-2025
import java.util.Scanner;

public class programm_two_promedios {
	// final grade

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 //declaring variables
	 double cf;
	 float ce1,ce2,ce3,ce4;
	 // capturing data 
	 System.out.println("enter grades from exam 1");
	 ce1=sc.nextFloat();
	 System.out.println("enter gardes from exam 2");
	 ce2=sc.nextFloat();
	 System.out.println("enter grades from exam 3");
	 ce3=sc.nextFloat();
	 System.out.println("enter grades from exam 4");
	 ce4=sc.nextFloat();
	 //perform operation
	 cf=(ce1*.10 + ce2*.25 + ce3*.50 + ce4*.15);
	 System.out.println("La calificacion final es: "+ cf);
	 sc.close();
	
	 

	}

}
