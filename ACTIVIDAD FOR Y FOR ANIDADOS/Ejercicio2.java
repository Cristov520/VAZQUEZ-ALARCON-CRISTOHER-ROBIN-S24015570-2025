import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Ingrsa el primer numero: ");
	int num1 = input.nextInt();
	System.out.print("Ingresa el segundo numero: ");
	int num2 = input.nextInt();
	int resultado = 0;
	
	for(int i = 1; i <= num2; i++) {
	    resultado += num1 * num1;
	}

	System.out.println(num1 + " elevado a la " + num2 + " es igual a: " + resultado);

    }
}