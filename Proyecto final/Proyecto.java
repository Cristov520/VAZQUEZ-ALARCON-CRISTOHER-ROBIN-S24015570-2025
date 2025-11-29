import java.util.Scanner;

public class Proyecto {
    static String trabajadores[][] = new String[3][4];
    static Scanner input = new Scanner(System.in);

    //Metodo main
    public static void main(String[] args) {

        //Se llama al metodo que muestra el menu
        mostrarMenu();

        
    }

    //Metodo que muestra el menu
    public static void mostrarMenu() {
        int opcion; //Sirve para indicar que opcion se va a elegir
        String consulta; //Sirve para las consultas por nombre y por id

        do {
            //Menu
            System.out.println("=====SISTEMA DE GESTION DE TRABAJADORES=====");
            System.out.println("1.- Alta de trabajadores");
            System.out.println("2.- Consulta generales");
            System.out.println("3.- Consultas por id");
            System.out.println("4.- Consultas por nombre");
            System.out.println("5.- Salir");
            System.out.println("============================================");
            System.out.print("Seleccione la opcion a realizar: ");
            opcion = Integer.parseInt(input.nextLine());
            System.out.println(""); //Salto de linea para un formato mas limpio

            switch (opcion) {
                case 1:
                    darDeAlta(trabajadores);
                    break;
            
                case 2:
                    consultasGenerales(trabajadores);
                    break;

                case 3: 
                    System.out.print("Ingrese el id del empleado: ");
                    consulta = input.nextLine();
                    consultaId(consulta);
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del empleado: ");
                    consulta = input.nextLine();
                    consultaNombre(consulta);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Error, opcion no valida, seleccione otra opción");

            }
        } while (opcion != 5);

        System.out.println("=====PROGRAMA TERMINADO=====");

        input.close(); //Cierra el escaner
    }
     

    //Metodo para dar de alta a los trabajadores
    public static void darDeAlta(String matriz[][]) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresa el nombre de empleado " + (i + 1) + ": ");
            matriz[i][0] = input.nextLine();
            
            boolean idRepetido; //Centinela que verifica que no haya id repetidos en el bucle
            //Ciclo que verifica que no haya dos id iguales
            do {
                idRepetido = false;
                System.out.print("Ingrese el id del empleado " + matriz[i][0] + ": ");
                matriz[i][1] = input.nextLine();
                for(int fila = 0; fila < i; fila++) {
                    if(matriz[i][1].equals(matriz[fila][1])) {
                        System.out.println("Error, ese id ya lo tiene otro empleado, intente con otro");
                        idRepetido = true;
                        break;
                    }
                }
            } while(idRepetido == true);
            System.out.print("Ingrese el sueldo del trabajador " + matriz[i][0] + ": ");
            matriz[i][2] = input.nextLine();
            System.out.print("Ingresa las horas trabajadas por el trabajador " + matriz[i][0] + ": ");
            matriz[i][3] = input.nextLine();

            
        }

        System.out.println("\tRegistros realizados correctamente\n");

    }

    //Metodo para las consultas generales
    public static void consultasGenerales(String matriz[][]) {
        //printf muestra la informacion con formato
        System.out.printf("%-20s %-10s %-10s %-10s\n",
                        "Nombre", "ID", "Sueldo", "Horas");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-20s %-10s %-10s %-10s\n",
                             matriz[i][0], matriz[i][1], "$" + matriz[i][2], matriz[i][3]);
        }
        System.out.println("");
    }


    //Metodo para las consultas por id
    public static void consultaId(String id) {
        for(int i = 0; i < 3; i++) {
            if(trabajadores[i][1].equals(id)) {  
                System.out.println("---------------EMPLEADO ENCONTRADO---------------\n");
                //Llama al metodo para imprimir la informacion de un solo empleado
                imprimirInformacion(i);
                return; //Sale del metodo cuando se cumple el if
            }

        }
        //Se ejecuta si no se encuentra a el empleado
        System.out.println("Empleado no encontrado, verifique que el id este escrito correctamente\n");

    }

    //Metodo para consultas por nombre
    public static void consultaNombre(String nombre) {
        for(int i = 0; i < 3; i++) {
            if(trabajadores[i][0].equals(nombre)) {
                System.out.println("---------------EMPLEADO ENCONTRADO---------------\n");
                //Llama al metodo para imprimir la informacion de un solo empleado
                imprimirInformacion(i);
                return; //Sale del metodo cuando se cumple el if
            } 
        }
        //Se ejecuta si no se encuentra al empleado
        System.out.println("Empleado no encontrado, verifique que el nombre este escrito correctamente\n");

    }

    //Metodo que imprime la informacion de solo un empleado
    public static void imprimirInformacion(int fila) {
        System.out.printf("%-20s %-10s %-10s %-10s\n",
                        "Nombre", "ID", "Sueldo", "Horas");
        System.out.println("--------------------------------------------------");

        System.out.printf("%-20s %-10s %-10s %-10s\n",
                        trabajadores[fila][0], trabajadores[fila][1], "$" + trabajadores[fila][2], trabajadores[fila][3]);
        System.out.println("");

        
    }



}
