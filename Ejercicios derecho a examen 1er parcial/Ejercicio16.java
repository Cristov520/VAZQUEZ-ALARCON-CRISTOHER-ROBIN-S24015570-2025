import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("======Par o impar=====");
        System.out.print("Ingresa un numero: ");
        int num = input.nextInt();
        
        if(num % 2 == 0) System.out.println("El numero " + num + " es par");
        else System.out.println("El numero " + num + " es impar");
        
        input.close();
    
    }
}
