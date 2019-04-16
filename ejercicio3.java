/*
Ejercicio 3 (15-4)
*/
import java.util.Scanner;
public class ejercicio3
{
	public static void main (String [] ar)
	{
		Scanner teclado = new Scanner (System.in);
		Float horas;
		Float sueldo;
		/* Ingreso de datos */
		System.out.println("CADA HORA SON $400:");
		System.out.println("Ingrese sus horas trabajadas en un mes:");
		horas=teclado.nextFloat();
		/* Se realizan las operaciones */
		sueldo= horas*400;
		/* Se imprimen las operaciones */
		System.out.println("Su sueldo es:");
		System.out.print(sueldo);
	}
	
}