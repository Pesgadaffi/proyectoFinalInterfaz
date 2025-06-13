import java.util.Scanner;

public class Utilidades {
    static Scanner scanner = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        int numero;
        while (true) {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(scanner.nextLine());
                if (numero < 0) {
                    System.out.println("El número no puede ser negativo");
                    continue;
                }
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
            }
        }
    }

    public static double leerDouble(String mensaje) {
        double numero;
        while (true) {
            try {
                System.out.print(mensaje);
                numero = Double.parseDouble(scanner.nextLine());
                if (numero < 0) {
                    System.out.println("El número no puede ser negativo");
                    continue;
                }
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
            }
        }
    }
}
