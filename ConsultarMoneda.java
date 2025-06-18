package com.aluracursos.conversordemonedas;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    // Esta función se conecta a la API de tasas de cambio y obtiene los datos
    public String buscarTasaConversion(String monedaBase, String monedaTarget){
        // Construye la URL para la API usando la moneda base proporcionada
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b5082bcbe22674822b1672a5/latest/"+monedaBase);

        // Crea un cliente HTTP para hacer la solicitud
        HttpClient client = HttpClient.newHttpClient();
        // Prepara la solicitud HTTP con la URL construida
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            // Envía la solicitud y obtiene la respuesta de la API
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Retorna el cuerpo de la respuesta (en formato JSON)
            return response.body();
        } catch (Exception e) {
            // Si hay un error, lanza una excepción con un mensaje descriptivo
            throw new RuntimeException("No se pudo obtener la información de la moneda: " + e.getMessage());
        }
    }
}
