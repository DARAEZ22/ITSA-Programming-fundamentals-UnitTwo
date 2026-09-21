package UNIDAD_2;

import java.util.Scanner;

public class Vowel_consonant10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	 System.out.println("Enter a letter:");
	 char letter= sc.next().charAt(0);
	 
	 letter= Character.toLowerCase(letter);
	 
	 if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u') {
		 System.out.println(letter+" is a vowel");
		 
	 }else if(letter>='a' && letter<='z') {
		 System.out.println(letter+" is a consonant");
		 
	 }else {
		 System.out.println(letter+" is not a letter!");
	 }
	 sc.close();
		
		

	}

}
