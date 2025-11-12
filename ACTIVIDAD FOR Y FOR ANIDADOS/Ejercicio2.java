public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int num1 = input.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = input.nextInt();
        int resultado = 1; 
        
        for (int i = 1; i <= num2; i++) {
            resultado *= num1; 
        }

        System.out.println(num1 + " elevado a la " + num2 + " es igual a: " + resultado);
    }
}
