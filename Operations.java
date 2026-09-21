package UNIDAD_2;
import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
	System.out.println("programa que realiza operacones aritmeticas");
	Scanner sc = new Scanner(System.in);
	//declare variables
	int n1,n2,suma,resta,multi;                   // (int) is for whole numbers
	double division;                              // double is for decimal
	// request information from the user
	System.out.println("ingresa un numero");
	n1=sc.nextInt();
	System.out.println("ingresa otro numero");
	n2=sc.nextInt();
	// perform the operations
	suma=n1 + n2;
	resta=n1-n2;
	multi=n1*n2;
	division=n1/n2;
	// send the result to print
	System.out.println("suma= "+ suma);  // this how you print stuff
	System.out.println("resta= "+resta);
	System.out.println("multiplicacion= "+multi);
	System.out.println("division= "+division);
	sc.close();
	}

}