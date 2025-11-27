import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        char continuar;
        double adeudo = 1000;
        double deudaDelMes = 200;
        
        do{
            System.out.println("=====Cajero automatico para pago de servicios=====");
            System.out.println("1.- Consulta");
            System.out.println("2.- Pago del mes");
            System.out.println("3.- Pago de adeudo");
            System.out.println("4.- Salir");
            System.out.print("Elija la opción a realizar: ");
            int opcion = input.nextInt();
            
            if(opcion == 1) {
                if(adeudo > 0) System.out.println("¡¡¡¡¡Actualmente tiene un adeudo de " + adeudo + " MXN!!!!");
                System.out.println("La deuda del mes actual es de " + deudaDelMes + " MXN");
                            
            } else if(opcion == 2) {
                if(deudaDelMes <= 0) {
                    System.out.println("El pago del mes es 0 por ende no se necesita realziar el pago");
                } else {
                    System.out.println("El pago del mes actual es de " + deudaDelMes + " MXN");
                    System.out.print("Ingrese el monto que desea pagar: ");
                    double monto = input.nextDouble();
                    
                    if(deudaDelMes >= monto) {
                        deudaDelMes -= monto;
                        System.out.println("Pago realizado con exito");
                    } else {
                        System.out.println("Error, el monto de pago no puede ser mayor que la deuda del mes");
                    }
                }
                
            } else if(opcion == 3) {
                if(adeudo <= 0) {
                    System.out.println("Su adeudo actual es 0 Por ende no se requiere pago");
                } else {
                    System.out.println("Su adeudo a pagar es de" + adeudo + " MXN");
                    System.out.print("Ingrese el monto que desea pagar: ");
                    double monto = input.nextDouble();
                    
                    if(adeudo >= monto) {
                        adeudo -= monto;
                        System.out.println("Pago realizado correctamente"); 
                    } else {
                        System.out.println("Error. El monto de pago no puede ser mayor que el adeudo");
                    }
                    
                }
                
            } else if(opcion == 4) {
                break;
            }
            
            input.nextLine();
            System.out.println("¡Deseas realizar otra operacion? s/n");
            continuar = input.nextLine().charAt(0);
            
        } while(continuar == 's' || continuar == 'S');
        
        System.out.println("Transacción finalizada, gracias por su preferencia");
        
        input.close();
    
    }
}

