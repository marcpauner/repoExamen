import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    // Implementar en una rama separada
                    break;
                case 2:
                    // Implementar en una rama separada
                    break;
                case 3:
                    // Implementar en una rama separada
                    break;
                case 4:
                    System.out.print("¿Está seguro de que desea salir? (s/n): ");
                    String respuesta = scanner.nextLine();
                    if (respuesta.equalsIgnoreCase("s")) {
                        continuar = false;
                        System.out.println("¡Gracias por usar el programa!");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }
}
