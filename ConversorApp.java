package com.aluracursos.conversordemonedas;

import java.util.Scanner;

public class ConversorApp {
    // Mét/odo principal que inicia la aplicación
    public static void main(String[] args) {
        // Inicializa el scanner para entrada de usuario y el consultor de monedas
        Scanner scanner = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        // Bucle principal del menú
        while (opcion != 8) {
            // Muestra el menú de opciones
            System.out.println("""
                    *-------------------------------------------------*
                    | *Bienvenido al conversor de monedas ConverCode* |
                    |                                                 |
                    |  Ingrese la conversion que deseas realizar:     |
                    |1. Dolar a Peso argentino                        |
                    |2. Peso argentino a Dolar                        |
                    |3. Dolar a Real brasileño                        |
                    |4. Real brasileño a Dolar                        |
                    |5. Dolar a Peso Colombiano                       |
                    |6. Peso Colombiano a Dolar                       |
                    |7. Otra Conversión                               |
                    |8. Salir                                         |
                    *-------------------------------------------------*
                    """);

            opcion = scanner.nextInt();
            scanner.nextLine();

            // Switch para manejar las diferentes opciones del menú
            switch (opcion) {
                case 1:
                    Conversor.convertir("USD", "ARS", consulta, scanner);
                    break;
                case 2:
                    Conversor.convertir("ARS", "USD", consulta, scanner);
                    break;
                case 3:
                    Conversor.convertir("USD", "BRL", consulta, scanner);
                    break;
                case 4:
                    Conversor.convertir("BRL", "USD", consulta, scanner);
                    break;
                case 5:
                    Conversor.convertir("USD", "COP", consulta, scanner);
                    break;
                case 6:
                    Conversor.convertir("COP", "USD", consulta, scanner);
                    break;
                case 7:
                    // Opción para conversión personalizada
                    System.out.println("""
                         Monedas disponibles (usar código de 3 letras):
                    
                    AED AFN ALL AMD ANG AOA ARS AUD AWG AZN BAM BBD BDT BGN BHD
                    BIF BMD BND BOB BRL BSD BTN BWP BYN BZD CAD CDF CHF CLP CNY
                    COP CRC CUP CVE CZK DJF DKK DOP DZD EGP ERN ETB EUR FJD FKP
                    FOK GBP GEL GGP GHS GIP GMD GNF GTQ GYD HKD HNL HRK HTG HUF
                    IDR ILS IMP INR IQD IRR ISK JEP JMD JOD JPY KES KGS KHR KID
                    KMF KRW KWD KYD KZT LAK LBP LKR LRD LSL LYD MAD MDL MGA MKD
                    MMK MNT MOP MRU MUR MVR MWK MXN MYR MZN NAD NGN NIO NOK NPR
                    NZD OMR PAB PEN PGK PHP PKR PLN PYG QAR RON RSD RUB RWF SAR
                    SBD SCR SDG SEK SGD SHP SLE SOS SRD SSP STN SYP SZL THB TJS
                    TMT TND TOP TRY TTD TVD TWD TZS UAH UGX USD UYU UZS VES VND
                    XCD XDR XOF XPF YER ZAR MW ZWL
                    """);

                    System.out.println("Ingrese la moneda de origen (ej: USD):");
                    String base = scanner.nextLine().toUpperCase();
                    System.out.println("Ingrese la moneda de destino (ej: EUR):");
                    String target = scanner.nextLine().toUpperCase();
                    Conversor.convertir(base, target, consulta, scanner);
                    break;
                case 8:
                    // Mensaje de despedida
                    System.out.println("Gracias por usar nuestra aplicación, ¡Hasta pronto!\n" +
                            "ConverCode.");
                    break;
                default:
                    System.out.println("Conversión no válida");
                    break;
            }
        }
    }
}
