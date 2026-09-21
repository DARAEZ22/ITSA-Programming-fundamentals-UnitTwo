package UNIDAD_2;

import java.util.Scanner;

public class AddThreeDigits {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num,sum,cent,dec,unit;
	System.out.println("enter three number:");
	num=sc.nextInt();
	if (num <= 999) {
	cent =num/100;
	dec = (num-(cent*100))/10;
	unit = num-(cent*100)-(dec*10);
	sum = cent+dec+unit;
	System.out.println("the sum of the numbers is; "+ sum);
	}else {
		System.out.println("invalid quantity");
	}
	sc.close();
	
	}

}

