package circulo;

import java.text.DecimalFormat;

/**
 * Clase principal que prueba la clase Circulo.
 * Crea un objeto Circulo, modifica sus atributos y muestra propiedades como
 * coordenadas, radio, diámetro, circunferencia y área.
 */
public class Main {
    /**
     * Método principal que ejecuta la aplicación.
     * 
     * @param args argumentos de línea de comandos (no utilizados en este ejemplo)
     */

    public static void main(String[] args) {
        // Crea un objeto Circulo con coordenadas (37,43) y radio 2.5
        Circulo circulo = new Circulo(37, 43, 2.5);

        // Construye una cadena con la información inicial del círculo
        String salida =
            "La coordenada X es " + circulo.obtenerX() +
            "\nLa coordenada Y es " + circulo.obtenerY() +
            "\nEl radio es " + circulo.obtenerRadio();

        // Modifica las coordenadas y el radio del círculo
        circulo.establecerX(35);
        circulo.establecerY(20);
        circulo.establecerRadio(4.2);

        // Agrega la nueva ubicación y radio del círculo
        salida += "\n\nLa nueva ubicación y el radio de círculo son\n" + circulo.toString();

        // Formato para mostrar dos dígitos decimales
        DecimalFormat dosDigitos = new DecimalFormat("0.00");

        // Agrega las propiedades geométricas del círculo a la salida
        salida += "\nEl diámetro es " + dosDigitos.format(circulo.obtenerDiametro());
        salida += "\nLa circunferencia es " + dosDigitos.format(circulo.obtenerCircunferencia());
        salida += "\nEl área es " + dosDigitos.format(circulo.obtenerArea());

        // Muestra la salida por consola
        System.out.println(salida);

        // Finaliza la ejecución del programa
        System.exit(0);
    }
}
