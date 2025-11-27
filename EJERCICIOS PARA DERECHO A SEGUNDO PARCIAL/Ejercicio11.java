import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[8];
        boolean existe = false;

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un numero: ");
            numeros[i] = input.nextInt();
        }
        
        System.out.print("Ingresa un numero para buscar en el array: ");
        int buscar = input.nextInt();
        
        for(int i = 0; i < numeros.length; i++) {
            if(buscar == numeros[i]) existe = true;  // CORREGIDO
        }
        
        if(existe) 
            System.out.println("El numero si está en el array");
        else 
            System.out.println("El numero no existe en el array");  // CORREGIDO

        input.close();
    }
}

