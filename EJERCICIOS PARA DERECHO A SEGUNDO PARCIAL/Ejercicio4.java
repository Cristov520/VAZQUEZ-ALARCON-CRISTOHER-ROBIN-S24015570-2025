import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        double saldo = 5000;
        char continuar;
        
        do {
            System.out.println("Cajero automatico para retiros");
            System.out.println("Su saldo actual es de " + saldo + " MXN");
            System.out.print("Ingrese la cantidad a retirar: ");
            double cantidad = input.nextDouble();
            
            if(saldo >= cantidad) {
                saldo -= cantidad;
                System.out.println("Retiro realizado con exito");
                System.out.println("Saldo actual: " + saldo + " MXN");
                
            } else {
                System.out.println("Error, saldo insuficiente");
            }
            
            input.nextLine();
            System.out.println("¿Desea continuar? s/n");
            continuar = input.nextLine().charAt(0);
            
            
        } while(continuar == 's' || continuar == 'S');
        
    
    }
}

