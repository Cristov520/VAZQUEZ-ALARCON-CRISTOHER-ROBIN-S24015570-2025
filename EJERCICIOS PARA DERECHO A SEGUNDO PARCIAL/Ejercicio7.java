import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\tTabla de multiplicar");
        System.out.print("Ingrese un numero: ");
        int num = input.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
    }
}

