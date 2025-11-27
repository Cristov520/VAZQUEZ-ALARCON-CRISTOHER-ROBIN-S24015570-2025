import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alumnos[] = new String[6];
        double calificaciones[] = new double[6];
        double promedio = 0;

        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
            alumnos[i] = input.nextLine();
            System.out.print("Ingresa la calificacion de " + alumnos[i] + ": ");
            calificaciones[i] = Double.parseDouble(input.nextLine());
            promedio += calificaciones[i];
        }

        promedio /= alumnos.length;

        System.out.println("\tCalificaciones de los alumnos");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i] + ": " + calificaciones[i]);
        }

        System.out.println("Promedio del grupo: " + promedio);

        input.close();
    }
}

