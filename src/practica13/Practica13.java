package practica13;

import java.util.Scanner;

public class Practica13 {

	static boolean salir = false;

	public static void main(String[] args) {
	Scanner entradaEscanner = new Scanner(System.in);
	String loteria;
	int probabilidad=0;
	
	do {
		System.out.println("¿Hemos comprado loteria? Y/N");
		loteria = entradaEscanner.nextLine();
	    if (!loteria.equalsIgnoreCase("Y")) {
	    	salir = true;
		}else {
			probabilidad +=1;
			
		    System.out.println("¿Hemos comprado más de un decimo? Y/N");
			loteria = entradaEscanner.nextLine();
			 
				if (loteria.equalsIgnoreCase("Y")) {
				salir = true;
				}
					else {
						probabilidad +=2; } 
			
		}
	}
	    
	    while (!salir); {
	
		}

	
	
	


	
}
}
