package UNIDAD_2;

import java.util.Scanner;

public class insurance_homework_num11 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String sexo;
	String civil;
	int edad;
	System.out.println("Please enter your gender:");
	sexo=sc.next();
	System.out.println("Please enter your marital status:");
	civil=sc.next();
	System.out.println("Please enter your age:");
	edad=sc.nextInt();
	if (civil.equalsIgnoreCase("married"))  {
		System.out.println("You are insured");
    }else if (sexo.equalsIgnoreCase("male")&& edad > 30){
	System.out.println("You are insured");
	}else if (sexo.equalsIgnoreCase("female") && edad > 25){
		System.out.println("You are insured");
	}
      else {
		System.out.println("you are not insured");
	

sc.close();
		
	
		
	}
	

	}

}
