package com.aluracursos.conversordemonedas;

// Record que representa una conversión de monedas con:
// - Código de moneda base
// - Código de moneda objetivo
// - Tasa de conversión
public record Monedas(String base_code,
                      String target_code,
                      double conversion_rate) {
}