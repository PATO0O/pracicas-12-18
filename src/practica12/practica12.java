package practica12;

import java.util.Scanner;

public class practica12 {
	
	static Scanner entradaEscanner = new Scanner(System.in);

	public static void main(String[] args) {

	int numero;
	int digitos = 0;
	boolean  mayordecincocifras = false;
	
	System.out.println("ponga un numero");
	numero = entradaEscanner.nextInt();
	
    while (numero!=0) {
    	numero = numero/10;
    	digitos++;	
	}
    if (digitos>5) {
    	mayordecincocifras = true;
    	System.out.println("el numero no es valido");
	} else {
		System.out.println("El número tiene " + digitos+ " cifras");
	}while(!mayordecincocifras);		
 		
	}
		
}

