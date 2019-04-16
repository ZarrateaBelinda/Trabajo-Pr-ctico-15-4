/*
Ejercicio 2 (15-4)
*/
import java.util.Scanner;
public class Ejercicio2java {
	public static void main (String[] ar){
		Scanner teclado = new Scanner (System.in);
		Float nota1;
		Float nota2;
		Float nota3;
		Float promedio;
		/* Ingreso de datos */
		System.out.print("Ingrese la primer nota:");
		nota1=teclado.nextFloat();
		System.out.print("Ingrese la segunda nota:");
		nota2=teclado.nextFloat();
		System.out.print("Ingrese la tercer nota:");
		nota3=teclado.nextFloat();
		/* Se realizan las operaciones */
		promedio= (nota1+nota2+nota3)/3;
		/* Se imprimen las operaciones */
		System.out.print ("Su promedio es:");
		System.out.print(promedio);
	}
	
}