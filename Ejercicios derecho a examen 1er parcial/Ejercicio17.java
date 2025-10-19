import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Numero primo=====");
        System.out.println("Ingrese un numero: ");
        int num = input.nextInt();
        
        if(num > 1) {
            int i = 2;
            boolean primo = true;
            while( i < num) {
                if(num % i == 0) {
                    primo = false;
                    i++;
                    break;
                }  
                i++;
            }
            
            if(primo) System.out.println("El numero " + num + " es primo");
            else System.out.println("El numero " + num + " no es primo");
            
        } else {
            System.out.println("El numero debe de ser mayor a 1");
        }
        
        input.close();
    
    }
}
