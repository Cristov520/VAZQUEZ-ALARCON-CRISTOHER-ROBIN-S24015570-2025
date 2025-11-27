import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[10];
        
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un numero: ");
            numeros[i] = input.nextInt();
        }
        
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        input.close();
    
    }
}

