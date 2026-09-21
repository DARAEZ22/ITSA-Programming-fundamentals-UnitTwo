package UNIDAD_2;

import java.util.Scanner;

public class ranges_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sup1;
		int inf1;
		int sup2;
		int inf2;
		System.out.println("enter superior number");
		sup1=sc.nextInt();
		System.out.println("enter inferior number");
		inf1=sc.nextInt();
		System.out.println("enter second superior number");
	sup2=sc.nextInt();
	System.out.println("enter second inferior number");
	inf2=sc.nextInt();
	System.out.println("enter your number");
	num=sc.nextInt();
	if(sup1>= num && inf1<= num) {
		System.out.println("It's in range 1");
	}else if(sup2 >= num && inf2 <= num) {
		System.out.println("It's in range 2");
	}else {
		System.out.println("The number is out of range");
		sc.close();
	}
			}

}
