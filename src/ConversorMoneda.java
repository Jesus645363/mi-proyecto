import java.util.Scanner;

public class ConversorMoneda {
    private final ServicioMoneda servicio;  // Guarda el servicio que tiene las tasas cargadas
    private final Scanner scanner;          // Scanner para leer datos del usuario

    public ConversorMoneda(ServicioMoneda servicio) {
        this.servicio = servicio;           // Se asigna el servicio recibido
        this.scanner = new Scanner(System.in); // Se inicializa el lector de consola
    }

    public void iniciar() {
        int opcion;

        do {
            // MENÚ DE OPCIONES
            System.out.println("\n=== CONVERSOR ===");
            System.out.println("1) USD → MXN");
            System.out.println("2) MXN → USD");
            System.out.println("3) USD → ARS");
            System.out.println("4) ARS → USD");
            System.out.println("5) USD → BRL");
            System.out.println("6) Salir");
            System.out.print("Elige opción: ");

            opcion = scanner.nextInt(); // Se lee la opción elegida por el usuario

            // SE EVALÚA LA OPCIÓN
            switch (opcion) {
                case 1 -> convertir("USD", "MXN"); // Convierte de dólares a pesos mexicanos
                case 2 -> convertir("MXN", "USD"); // Convierte de pesos mexicanos a dólares
                case 3 -> convertir("USD", "ARS"); // Convierte de dólares a pesos argentinos
                case 4 -> convertir("ARS", "USD"); // Convierte de pesos argentinos a dólares
                case 5 -> convertir("USD", "BRL"); // Convierte de dólares a reales brasileños
                case 6 -> System.out.println("¡Hasta luego!"); // Finaliza el programa
                default -> System.out.println("Opción no válida."); // Opción fuera del menú
            }

        } while (opcion != 6); // Repite hasta que el usuario elija 6 (salir)
    }


    //  MÉ_TODO QUE REALIZA LA CONVERSIÓN
    private void convertir(String from, String to) {

        // 1. Solicitar monto al usuario
        System.out.print("Monto en " + from + ": ");
        double monto = scanner.nextDouble(); // Lee la cantidad que quiere convertir

        // 2. Obtener la tasa de conversión del servicio
        double tasa = servicio.obtenerTasa(from, to);

        // 3. Aplicar la fórmula de conversión
        double resultado = monto * tasa;

        // 4. Mostrar el resultado formateado
        System.out.printf("\n%.2f %s equivalen a %.2f %s\n", monto, from, resultado, to);
    }
}
