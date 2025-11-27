import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        String paises[] = new String[4];
        double temp[][] = new double[4][4];
        double tempTrimestral = 0;
        
        for(int i = 0; i < paises.length; i++) {
            System.out.print("Ingresa el nombre del pais " + (i + 1) + ": ");
            paises[i] = input.nextLine();
            
            for(int j = 0; j < 3; j++) {
                System.out.print("Ingresa la temperatura media del  " + (j + 1) + " mes del pais " + paises[i] + ": ");
                temp[i][j] = Double.parseDouble(input.nextLine());
                tempTrimestral += temp[i][j];
            
            }
            temp[i][3] = tempTrimestral / 3;
            tempTrimestral = 0;
        }
        
        System.out.println("\tInformacion de los paises");
        System.out.printf("%-15s %-8s %-8s %-8s %-8s\n", 
            "Pais", "Temp1", "Temp2", "Temp3", "Media");
            
            for(int i = 0; i < 4; i++) {
                System.out.printf("%-15s ", paises[i]);
    
                for(int j = 0; j < 4; j++) {
                    System.out.printf("%-8.2f ", temp[i][j]);
                
                }
                System.out.println("");
            }
            
            
            input.close();
        
    
    }
}
