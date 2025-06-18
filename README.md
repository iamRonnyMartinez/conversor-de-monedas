                                Conversor de Monedas ConverCode 💱


                                        📑 Índice

        1. Descripción del Proyecto
        
        2. Características Principales
        
        3. Funcionalidades
        
        4. Tecnologías Usadas
        
        5. Requisitos
        
        6. Guía de Uso
        
        7. Estructura del Código
        
        8. Diagrama de Flujo
        
        9. API Utilizada
        
        10. Desarrollador


                                    📌 Descripción del Proyecto
                                    
    
        ConverCode es una aplicación de línea de comandos desarrollada en Java que permite realizar
        conversiones de monedas en tiempo real utilizando tasas de cambio actualizadas. Soporta más
        de 160 divisas y registra un historial de todas las operaciones realizadas.



                                🌟 Características Principales
                                

        ✅ Conversión en tiempo real con tasas actualizadas.
        ✅ Interfaz intuitiva con menú interactivo.
        ✅ Historial de conversiones para consultar operaciones anteriores.
        ✅ Soporte para múltiples monedas (USD, EUR, ARS, BRL, COP, etc.).
        ✅ Manejo de errores robusto para conexiones fallidas o datos inválidos.



                                        🛠 Funcionalidades
                                        

        Conversión entre monedas predefinidas (USD → ARS, BRL → USD, etc.).
        
        Conversión personalizada (elige cualquier par de monedas soportadas).
        
        Visualización del historial de conversiones.
        
        Formateo de resultados para mejor legibilidad.



                                        💻 Tecnologías Usadas
                                        

        Lenguaje: Java 17
        
        Librerías:
        
        java.net.http (para conexiones API).
        
        Gson (para manejo de JSON).
        
        API: ExchangeRate-API (https://www.exchangerate-api.com/).



                                        📋 Requisitos
                                        

        Java JDK 17 o superior instalado.
        
        Conexión a internet para acceder a las tasas de cambio.
        
        API Key gratuita de ExchangeRate-API (se incluye una key de prueba en el código).



                                        📖 Guía de Uso
                                        

Paso 1: Ejecutar la aplicación
bash
java ConversorApp
Paso 2: Menú principal
https://via.placeholder.com/600x400?text=Captura+Men%C3%BA+Principal
(Ejemplo: Menú de opciones)

Paso 3: Seleccionar conversión
Elige una opción del 1 al 7 para conversiones predefinidas o personalizadas.

Paso 4: Ingresar cantidad
https://via.placeholder.com/600x400?text=Captura+Conversi%C3%B3n
(Ejemplo: Convertir 100 USD a ARS)

Paso 5: Ver resultado
text
100.0 USD = 98350.0 ARS


                                        📂 Estructura del Código
                                        

        src/
        ├── main/
        │   ├── java/
        │   │   ├── com/aluracursos/conversordemonedas/
        │   │   │   ├── ConversorApp.java       # Menú principal
        │   │   │   ├── Conversor.java          # Lógica de conversión
        │   │   │   ├── ConsultarMoneda.java    # Conexión con la API
        │   │   │   ├── Monedas.java            # Modelo de datos
        │   │   │   └── HistorialConversiones.java # Gestión del historial



                                        📊 Diagrama de Flujo
                                        

![deepseek_mermaid_20250618_1559d1](https://github.com/user-attachments/assets/f1208f92-0401-4564-81e1-863d33083a47)


                                        🌐 API Utilizada
                                        
        ExchangeRate-API: Servicio gratuito para obtener tasas de cambio actualizadas.
        
        Documentación: https://www.exchangerate-api.com/docs


                                        👨‍💻 Desarrollador
        Ronny Martinez
        
        GitHub: @iamRonnyMartinez
        
        LinkedIn: linkedin.com/in/ronny-martinez-76640b343
