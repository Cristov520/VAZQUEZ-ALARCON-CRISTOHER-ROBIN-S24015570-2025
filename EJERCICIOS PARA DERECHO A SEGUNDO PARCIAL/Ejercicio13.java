import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);   
        String alumnos[][] = new String[3][4];
        
        for(int nivel = 0; nivel < 3; nivel++) {
            for(int idioma = 0; idioma < 4; idioma++) {
                System.out.println("\tIngresa al alumno");
                switch(nivel) {
                    case 0 -> System.out.print("Alumno de nivel bajo ");
                    case 1 -> System.out.print("Alumno de nivel medio ");
                    case 2 -> System.out.print("Alumno de nivel de perfeccionamiento ");
                        
                }
                
                switch(idioma) {
                    case 0 -> System.out.print("que estudia Ingles: ");
                    case 1 -> System.out.print("que estudia Frances: ");
                    case 2 -> System.out.print("que estudia Aleman: ");
                    case 3 -> System.out.print("que estudia Ruso: ");
                
                }
                
                alumnos[nivel][idioma] = input.nextLine();
                
            }
        }
        
        System.out.println("\tMostrando datos de los alumnos...");
        for(int nivel = 0; nivel < 3; nivel++) {
            for(int idioma = 0; idioma < 4; idioma++) {
                switch(nivel) {
                    case 0 -> System.out.print("Alumno con nivel bajo ");
                    case 1 -> System.out.print("Alumno con nivel medio ");
                    case 2 -> System.out.print("Alumno con nivel de perfeccionamiento ");
                        
                }
                
                switch(idioma) {
                    case 0 -> System.out.print("de Ingles: ");
                    case 1 -> System.out.print("de Frances: ");
                    case 2 -> System.out.print("de Aleman: ");
                    case 3 -> System.out.print("de Ruso: ");
                
                }
                
                System.out.println(alumnos[nivel][idioma]);
            
            }
        }
        
        input.close();
            
    
    }
}
