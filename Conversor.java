package com.aluracursos.conversordemonedas;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.Scanner;

public class Conversor {
    // Función principal que realiza la conversión de monedas
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner scanner) {
        double cantidad;
        double cantidadConvertida;
        double conversionRate = 0;

        try {
            // Obtiene los datos de conversión desde la API
            String jsonResponse = consulta.buscarTasaConversion(monedaBase, monedaTarget);

            // Parsea la respuesta JSON usando la librería Gson
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(jsonResponse, JsonObject.class);

            // Extrae las tasas de conversión del objeto JSON
            if (jsonObject.has("conversion_rates")) {
                JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
                // Busca la tasa específica para la moneda objetivo
                if (conversionRates.has(monedaTarget)) {
                    conversionRate = conversionRates.get(monedaTarget).getAsDouble();
                } else {
                    System.out.println("No se encontró la tasa de conversión para " + monedaTarget);
                    return;
                }
            } else {
                System.out.println("La respuesta de la API no contiene 'conversion_rates'.");
                return;
            }

            // Crea un objeto Monedas con los datos obtenidos
            Monedas monedas = new Monedas(monedaBase, monedaTarget, conversionRate);

            // Muestra la tasa de conversión formateada con 6 decimales
            System.out.printf("La tasa de conversion para hoy 1 %s = %.6f %s%n", monedaBase, monedas.conversion_rate(), monedaTarget);

            // Solicita al usuario la cantidad a convertir
            System.out.println("Ingrese la cantidad de " + monedaBase);
            cantidad = Double.parseDouble(scanner.nextLine());

            // Realiza el cálculo de la conversión
            cantidadConvertida = cantidad * monedas.conversion_rate();

            // Muestra el resultado final de la conversión
            System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedaTarget);

        } catch (Exception e) {
            // Manejo de errores generales
            System.out.println("Ocurrió un error al realizar la conversión: " + e.getMessage());
            System.out.println("Asegúrate de que las monedas ingresadas sean válidas y tengas conexión a internet.");
        }
    }
}
