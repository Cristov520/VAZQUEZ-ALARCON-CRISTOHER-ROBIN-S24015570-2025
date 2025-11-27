import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        String empleados[] = new String[4];
        double sueldo[][] = new double[4][4];
        double total = 0;
        
        
        for(int i = 0; i < empleados.length; i++) {
            System.out.print("Ingresa el nombre del empleado " + (i + 1) + ": ");
            empleados[i] = input.nextLine();
            
            for(int columnas = 0; columnas < 3; columnas++) {
                System.out.print("Ingresa el sueldo recibido por " + empleados[i] + " en el mes " + (columnas + 1) + ": ");
                sueldo[i][columnas] = Double.parseDouble(input.nextLine());
                total += sueldo[i][columnas];
                
            }
            sueldo[i][3] = total;
            total = 0;
            
            
            
        
        }
        
        System.out.printf("%-12s %-8s %-8s %-8s %-8s\n", 
                  "Nombre", "Mes1", "Mes2", "Mes3", "Total");
        
        for(int i = 0; i < 4; i++) {
            System.out.printf("%-12s ", empleados[i]);
    
            for(int j = 0; j < 4; j++) {
                System.out.printf("%-8.2f ", sueldo[i][j]);
            }
            System.out.println();
        }

        
        
        input.close();
    
    }
}
