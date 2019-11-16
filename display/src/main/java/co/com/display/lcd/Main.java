package co.com.display.lcd;

import co.com.display.lcd.modelos.Entrada;
import co.com.display.lcd.utilidades.Display;
import co.com.display.lcd.utilidades.LectorEntrada;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ingrese los datos de entrada: size (Nro. entre 1 y 10),number (Nros. entre 0 y 9)." +
                " Por ejemplo: 2,12345 o 0,0 para finalizar el programa.");

        // Lista para almacenar y manipular datos de entrada.
        List<Entrada> entradas = LectorEntrada.obtenerEntradas();

        // Verificar el tamaño de la cadena de entrada.
        if (!entradas.isEmpty()) {

            // Técnica de desplazamiento para iterar sobre la lista entradas.
            for (Entrada entrada : entradas) {

                // Calcular el número de filas para la representación del dígito en pantalla.
                int filas = entrada.getSize() * 2 + 3;

                //Calcular el número de columnas para la representación del dígito en pantalla.
                int columnas = entrada.getSize() + 2;

                // Matriz para agregar los digitos a imprimir en pantalla.
                char[][] number = null;

                // Técnica de desplazamiento para iterar sobre los digitos de las cadenas ingresadas.
                for (char digito : entrada.getDigitos()) {

                    char[][] matrizDigito = Display.getDigitoComoMatriz(filas, columnas, digito);

                    number = Display.agregarDigito(number, matrizDigito);

                }

                // Corroborar si hay digitos para imprimir.
                if (number != null) {

                    Display.printMatriz(number);

                }

            }

        } else {
            // Controlar la excepción cuando solamente se ingresa la cadena 0,0
            System.out.println("\nIngreso solo la cadena 0,0 y el programa ha finalizado.");

        }

    }

}