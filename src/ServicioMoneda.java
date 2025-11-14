import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class ServicioMoneda {

    private Map<String, Double> tasas = new HashMap<>();
    // Este mapa almacenará todas las tasas de conversión
    // Ejemplo: "MXN" → 17.05, "ARS" → 1010.30, etc.

    // MÉ_TODO PARA CARGAR TODAS LAS TASAS DESDE LA API
    public void cargarTasas(String url) throws Exception {

        // Se crea un cliente HTTP para hacer la solicitud
        HttpClient cliente = HttpClient.newHttpClient();

        // Se prepara la solicitud GET con la URL de la API
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        // Se envía la solicitud y se obtiene la respuesta en texto
        HttpResponse<String> respuesta =
                cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

        // Se convierte la respuesta a JSON
        JsonElement elemento = JsonParser.parseString(respuesta.body());
        JsonObject objetoRaiz = elemento.getAsJsonObject();

        // Se obtiene el objeto llamado "conversion_rates"
        JsonObject conversionRates = objetoRaiz.getAsJsonObject("conversion_rates");

        // Se recorre _todo el JSON y se guarda en el mapa
        for (String codigo : conversionRates.keySet()) {
            double valor = conversionRates.get(codigo).getAsDouble();
            tasas.put(codigo, valor); // Guardar tasa por código de moneda
        }
    }

    // MÉ_TODO PARA OBTENER UNA TASA ENTRE DOS MONEDAS
    public double obtenerTasa(String from, String to) {

        // 1. Obtener valor de cada moneda con respecto al USD
        double tasaFrom = tasas.get(from); // valor de 1 FROM en USD
        double tasaTo = tasas.get(to);     // valor de 1 TO en USD

        // 2. Fórmula universal para obtener la tasa entre dos monedas
        return tasaTo / tasaFrom;
    }
}
