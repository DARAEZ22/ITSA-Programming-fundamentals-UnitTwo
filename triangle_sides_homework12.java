package UNIDAD_2;

import java.util.Scanner;

public class triangle_sides_homework12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int side1,side2,side3;
		System.out.println("enter side 1");
		side1=sc.nextInt();
		System.out.println("enter side 2");
		side2=sc.nextInt();
		System.out.println("enter side 3");
		side3=sc.nextInt();
		if ((side1 + side2 > side3) &&
		(side2 + side3 > side1) &&
		(side1 + side3 > side2)){
			System.out.println("Valid triangle");
		}else {
			System.out.println("Invalid traingle!");
			sc.close();
		}

	}

}
