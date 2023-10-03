import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese dos numeros enteros: ");
		int num1 = leer.nextInt();
		int num2 = leer.nextInt();

		suma(num1, num2);
		resta(num1, num2);
		multiplicar(num1, num2);
		division(num1, num2);
	}
	public static void suma(int num1, int num2){

		int sum;
		sum = num1 + num2;
		System.out.println("La suma de los numeros ingresados es: " + sum);
	}

	public static void resta(int num1, int num2){
		int resta;
		resta = num1 - num2;
		System.out.println("La resta de los numeros ingresados es: " + resta);
	}

	public static void multiplicar(int num1, int num2){
		int multiplicacion;
		multiplicacion = num2 * num1;
		System.out.println("La multiplicacion de los numeros ingresados es: " + multiplicacion);
	}

	public static void division(int num1, int num2){
		int division;
		division = num1 / num2;
		System.out.println("La division de los numeros ingresados es: " + division);
	}
}