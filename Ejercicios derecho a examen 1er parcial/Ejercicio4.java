import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Calcular edad=====");
        System.out.println("Ingresa tu año de nacimiento");
        int añoNacimiento = input.nextInt();
        int edad = 2025 - añoNacimiento;
        
        System.out.println("Tu edad en 2025 es= " + edad);
        
        input.close();
    
    }
}
