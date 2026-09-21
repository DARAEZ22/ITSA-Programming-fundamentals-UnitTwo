package UNIDAD_2;

import java.util.Scanner;

public class trangle_sides9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int side1;
		int side2;
		int side3;
		System.out.println("enter side 1");
		side1=sc.nextInt();
		System.out.println("enter side 2");
		side2=sc.nextInt();
		System.out.println("enter side 3");
		side3=sc.nextInt();
		if (side1 + side2 + side3 == 180) {
			System.out.println("valid triangle");
		}else {
			System.out.println("invalid triangle");
			sc.close();
		}

	}

}
