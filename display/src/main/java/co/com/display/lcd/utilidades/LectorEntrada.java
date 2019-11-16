package co.com.display.lcd.utilidades;

import co.com.display.lcd.modelos.Entrada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LectorEntrada {

    // Expresión regular para validar las cadenas ingresadas por teclado.
    private static final String PATRON = "([1-9]|10),[0-9]+";

    // Cadena que al ser ingresada por teclado finaliza el programa.
    private static final String CADENA_TERMINACION = "0,0";

    // Obtener y almacenar las cadenas ingresadas por teclado.
    public static List<Entrada> obtenerEntradas() {

        List<Entrada> entradas = new ArrayList<>();

        String cadena;

        Scanner entradaTeclado = new Scanner(System.in);

        do {

            System.out.println("\nEntrada: ");

            cadena = entradaTeclado.next();

            if (cadena.equalsIgnoreCase(CADENA_TERMINACION)) {

                break;

            } else if (!validarEntrada(cadena)) {

                System.out.println("\nIngrese una cadena válida; size (Nro. entre 1 y 10),number (Nros. entre 0 y 9)." +
                        " Por ejemplo: 2,12345 o 0,0 para finalizar el programa.");

            } else {

                entradas.add(generarEntrada(cadena));

            }

        } while (true);

        return entradas;

    }

    // Generar entradas a partir de las cadenas ingresadas por teclado.
    private static Entrada generarEntrada(String cadena) {

        String[] partes = cadena.split(",");

        int size = Integer.parseInt(partes[0]);

        char[] digitos = partes[1].toCharArray();

        return new Entrada(size, digitos);
    }

    // Validar las cadenas ingresadas por teclado.
    public static boolean validarEntrada(String cadena) {

        Pattern patron = Pattern.compile(PATRON);

        return patron.matcher(cadena).matches();

    }

}