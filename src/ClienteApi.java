public class ClienteApi {
    public static void main(String[] args) {
        try {
            // URL de la API con la llave incluida
            String url = "https://v6.exchangerate-api.com/v6/5d1df354a96948a4bebd7a6e/latest/USD";

            // Se crea un objeto del servicio encargado de cargar las tasas
            ServicioMoneda servicio = new ServicioMoneda();

            // Cargar las tasas de conversión desde la API
            servicio.cargarTasas(url);

            // Crear el conversor, que usará el servicio anterior
            ConversorMoneda conversor = new ConversorMoneda(servicio);

            // Iniciar el menú del conversor
            conversor.iniciar();

        } catch (Exception e) {
            // Si ocurre cualquier error, se imprime la excepción
            e.printStackTrace();
        }
    }
}
