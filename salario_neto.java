package UNIDAD_2;

import java.util.Scanner;

public class salario_neto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 double taxes;
	 double scotizacion;
	 double smedico;
	 double sbruto;
	 double sneto;
	 System.out.println("Ingresa tu salario bruto");
	 sbruto=sc.nextDouble();
	 taxes= sbruto*.12;
	 scotizacion= sbruto*.05;
	 smedico=sbruto*.045;
	 sneto=sbruto-(taxes+scotizacion+smedico);
	 System.out.println("El salario neto es: "+ sneto);
	 sc.close();
	 
	}

}
