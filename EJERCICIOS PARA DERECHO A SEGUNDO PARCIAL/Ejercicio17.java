import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        String atletas[][] = new String[3][4];  
        double mejorTiempo = Double.MAX_VALUE;
        double tiempo;
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                switch(j) {
                    case 0 -> System.out.print("Ingresa el nombre del atleta: ");
                    case 1 -> System.out.print("Ingresa el apellido del atleta: ");
                    case 2 -> System.out.print("Ingresa la especialidad del atleta: ");
                    case 3 -> System.out.print("Ingresa el tiempo del atleta: ");
                }
                
                atletas[i][j] = input.nextLine();
                
                
            }
            
            tiempo = Double.parseDouble(atletas[i][3]);
            if(tiempo < mejorTiempo) mejorTiempo = tiempo;
            
        }
        
        System.out.println("\n\tInformación de los atletas");
        System.out.printf("%-12s %-12s %-15s %-10s\n", 
            "Nombre", "Apellido", "Especialidad", "Tiempo (s)");
        
        for(int i = 0; i < 3; i++) {
            System.out.printf("%-12s %-12s %-15s %-10s\n",
                atletas[i][0],
                atletas[i][1],
                atletas[i][2],
                atletas[i][3]
            );
        }
        
        System.out.println("El mejor tiempo fue: " + mejorTiempo);
        
        input.close();
    
    }
}

