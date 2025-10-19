import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Calculador de pulsaciones=====");
        System.out.println("Ingresa tu edad: ");
        int edad = input.nextInt();
        int pulsaciones = (220 - edad) / 10;
        
        System.out.println("Debes tener " + pulsaciones + " por cada 10 segundos al momento de hacer ejercicio");
        
        input.close();
    
    }
}
