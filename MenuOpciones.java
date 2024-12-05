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
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la primera palabra: ");
                    String palabra1 = scanner.nextLine();
                    System.out.print("Ingrese la segunda palabra: ");
                    String palabra2 = scanner.nextLine();
                    System.out.println("Resultado: " + palabra1 + palabra2);
                    break;
                case 2:
                    System.out.print("Ingrese una frase: ");
                    String frase = scanner.nextLine();
                    String[] palabras = frase.trim().split("\\s+"); // Divide la frase en palabras
                    System.out.println("La frase contiene " + palabras.length + " palabras.");
                    break;
                case 3:
                System.out.print("Ingrese una frase: ");
    String fraseUsuario = scanner.nextLine();
    System.out.print("Ingrese la letra que desea contar: ");
    String letraInput = scanner.nextLine();

    if (letraInput.isEmpty()) {
        System.out.println("No se ingresó ninguna letra.");
        break;
    }
    char letra = letraInput.charAt(0);
    int contador = 0;

    for (char c : fraseUsuario.toCharArray()) {
        if (c == letra) {
            contador++;
        }
    }
    System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
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
                    System.out.println("Opcion no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }
}
