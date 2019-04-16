/*
Ejercicio 1 (15-4)
*/
import java.util.Scanner;
public class Ejercicio1
{
	public static void main (String [] ar)
	{
		Scanner teclado = new Scanner (System.in);
		int numero1;
		int numero2;
		int multiplicacion;
		int resta;
		int suma;
		int division;
		/* Ingreso de datos */
		System.out.print("Ingrese el primer numero:");
		numero1=teclado.nextInt();
		System.out.print("Ingrese el segundo numero:");
		numero2=teclado.nextInt();
		/* Se realizan las operaciones */
		suma= numero1+numero2;
		resta=numero1-numero2;
		division=numero1/numero2;
		multiplicacion=numero1*numero2;
		/* Se imprimen las operaciones */
		System.out.print ("La suma es:");
		System.out.print(suma);
		System.out.print ("La resta es:");
		System.out.print(resta);
		System.out.print ("La division es:");
		System.out.print(division);
		System.out.print ("La multiplicacion es:");
		System.out.print(multiplicacion);

	}
	
}