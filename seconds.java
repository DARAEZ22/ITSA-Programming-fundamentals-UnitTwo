package UNIDAD_2;

import java.util.Scanner;

public class seconds {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int sec,min,hour,seconds;
		System.out.println("Enter seconds");
		sec=sc.nextInt();
		hour=sec/3600;
		min=(sec%3600)/60;
		seconds=(sec%60);
		System.out.println("this is equivalent to: "+hour+ " hours ,"+min+ " minutes ,"+seconds+ " seconds");
		
	sc.close();
		
	
		

	}

}
