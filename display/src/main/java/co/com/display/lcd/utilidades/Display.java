package co.com.display.lcd.utilidades;

import org.apache.commons.lang.ArrayUtils;

public class Display {

   // Especificación de los segmentos que conforman un digito en la representación en pantalla.
    public enum Lado {

        HORIZONTAL_SUPERIOR,
        HORIZONTAL_INTERMEDIO,
        HORIZONTAL_INFERIOR,
        VERTICAL_IZQUIERDO_SUPERIOR,
        VERTICAL_IZQUIERDO_INFERIOR,
        VERTICAL_DERECHO_SUPERIOR,
        VERTICAL_DERECHO_INFERIOR,

    }

    // Obtener un digito como matriz.
    public static char[][] getDigitoComoMatriz(int filas, int columnas, char digito) {

        char[][] matriz = new char[filas][columnas];

        Lado[] ladosDigito = getLadosPorDigito(digito);

        for (Lado lado : ladosDigito) {

            llenarLado(matriz, lado);

        }

        return matriz;

    }

    // Agregar los digitos a la matriz de representación en pantalla.
    public static char[][] agregarDigito(char[][] matrizActual, char[][] matrizDigito) {

        char[][] resultado = new char[matrizDigito.length][1];

        for (int i = 0; i < matrizDigito.length; i++) {

            matrizDigito[i] = ArrayUtils.add(matrizDigito[i], ' ');

            if (matrizActual != null) {

                resultado[i] = ArrayUtils.addAll(matrizActual[i], matrizDigito[i]);

            } else {

                resultado[i] = matrizDigito[i];

            }

        }

        return resultado;

    }

    // Llenar los segmentos que conforman un digito en la representación en pantalla.
    public static void llenarLado(char[][] matrizDigito, Lado lado) {

        switch (lado) {
            // Lado.
            case HORIZONTAL_SUPERIOR: {

                int fila = 0;

                for (int j = 1; j < matrizDigito[fila].length - 1; j++) {

                    matrizDigito[fila][j] = '-';

                }

                break;

            }
            // Lado.
            case HORIZONTAL_INTERMEDIO: {

                int fila = matrizDigito.length / 2;

                for (int j = 1; j < matrizDigito[fila].length - 1; j++) {

                    matrizDigito[fila][j] = '-';

                }

                break;

            }
            // Lado.
            case HORIZONTAL_INFERIOR: {

                int fila = matrizDigito.length - 1;

                for (int j = 1; j < matrizDigito[fila].length - 1; j++) {

                    matrizDigito[fila][j] = '-';

                }

                break;

            }
            // Lado.
            case VERTICAL_IZQUIERDO_SUPERIOR: {

                int columna = 0;

                int fila = matrizDigito.length / 2;

                for (int i = 1; i < fila; i++) {

                    matrizDigito[i][columna] = '|';

                }

                break;

            }
            // Lado.
            case VERTICAL_IZQUIERDO_INFERIOR: {

                int columna = 0;

                int fila = matrizDigito.length / 2 + 1;

                for (int i = fila; i < matrizDigito.length - 1; i++) {

                    matrizDigito[i][columna] = '|';

                }

                break;
            }
            // Lado.
            case VERTICAL_DERECHO_SUPERIOR: {

                int columna = matrizDigito[0].length - 1;

                int fila = matrizDigito.length / 2;

                for (int i = 1; i < fila; i++) {

                    matrizDigito[i][columna] = '|';

                }

                break;

            }
            // Lado.
            case VERTICAL_DERECHO_INFERIOR: {

                int columna = matrizDigito[0].length - 1;

                int fila = matrizDigito.length / 2 + 1;

                for (int i = fila; i < matrizDigito.length - 1; i++) {

                    matrizDigito[i][columna] = '|';

                }

                break;

            }

        }

    }

    // Obtener los segmentos/lados que conforman un digito en la representación en pantalla.
    public static Lado[] getLadosPorDigito(char digito) {

        switch (digito) {

            case '0': {

                return new Lado[]{

                        Lado.HORIZONTAL_SUPERIOR,
                        Lado.HORIZONTAL_INFERIOR,
                        Lado.VERTICAL_IZQUIERDO_SUPERIOR,
                        Lado.VERTICAL_IZQUIERDO_INFERIOR,
                        Lado.VERTICAL_DERECHO_SUPERIOR,
                        Lado.VERTICAL_DERECHO_INFERIOR

                };

            }
            // Representación del número 1.
            case '1': {

                return new Lado[]{

                        Lado.VERTICAL_DERECHO_SUPERIOR,
                        Lado.VERTICAL_DERECHO_INFERIOR

                };

            }
            // Representación del número 2.
            case '2': {

                return new Lado[]{

                        Lado.HORIZONTAL_SUPERIOR,
                        Lado.HORIZONTAL_INFERIOR,
                        Lado.HORIZONTAL_INTERMEDIO,
                        Lado.VERTICAL_IZQUIERDO_INFERIOR,
                        Lado.VERTICAL_DERECHO_SUPERIOR

                };

            }
            // Representación del número 3.
            case '3': {

                return new Lado[]{

                        Lado.HORIZONTAL_SUPERIOR,
                        Lado.HORIZONTAL_INFERIOR,
                        Lado.HORIZONTAL_INTERMEDIO,
                        Lado.VERTICAL_DERECHO_SUPERIOR,
                        Lado.VERTICAL_DERECHO_INFERIOR

                };

            }
            // Representación del número 4.
            case '4': {

                return new Lado[]{

                        Lado.HORIZONTAL_INTERMEDIO,
                        Lado.VERTICAL_IZQUIERDO_SUPERIOR,
                        Lado.VERTICAL_DERECHO_SUPERIOR,
                        Lado.VERTICAL_DERECHO_INFERIOR

                };

            }
            // Representación del número 5.
            case '5': {

                return new Lado[]{

                        Lado.HORIZONTAL_SUPERIOR,
                        Lado.HORIZONTAL_INFERIOR,
                        Lado.HORIZONTAL_INTERMEDIO,
                        Lado.VERTICAL_IZQUIERDO_SUPERIOR,
                        Lado.VERTICAL_DERECHO_INFERIOR

                };

            }
            // Representación del número 6.
            case '6': {

                return new Lado[]{

                        Lado.HORIZONTAL_SUPERIOR,
                        Lado.HORIZONTAL_INFERIOR,
                        Lado.HORIZONTAL_INTERMEDIO,
                        Lado.VERTICAL_IZQUIERDO_SUPERIOR,
                        Lado.VERTICAL_IZQUIERDO_INFERIOR,
                        Lado.VERTICAL_DERECHO_INFERIOR

                };

            }
            // Representación del número 7.
            case '7': {

                return new Lado[]{

                        Lado.HORIZONTAL_SUPERIOR,
                        Lado.VERTICAL_DERECHO_SUPERIOR,
                        Lado.VERTICAL_DERECHO_INFERIOR

                };

            }
            // Representación del número 9.
            case '9': {

                return new Lado[]{

                        Lado.HORIZONTAL_SUPERIOR,
                        Lado.HORIZONTAL_INFERIOR,
                        Lado.HORIZONTAL_INTERMEDIO,
                        Lado.VERTICAL_IZQUIERDO_SUPERIOR,
                        Lado.VERTICAL_DERECHO_SUPERIOR,
                        Lado.VERTICAL_DERECHO_INFERIOR

                };

            }
            // Representación del número 8.
            default: {

                return new Lado[]{

                        Lado.HORIZONTAL_SUPERIOR,
                        Lado.HORIZONTAL_INFERIOR,
                        Lado.HORIZONTAL_INTERMEDIO,
                        Lado.VERTICAL_IZQUIERDO_SUPERIOR,
                        Lado.VERTICAL_IZQUIERDO_INFERIOR,
                        Lado.VERTICAL_DERECHO_SUPERIOR,
                        Lado.VERTICAL_DERECHO_INFERIOR

                };

            }

        }

    }

    // Imprimir/representar los digitos en pantalla.
    public static void printMatriz(char[][] matriz) {

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                buffer.append(matriz[i][j] == 0 ? ' ' : matriz[i][j]);

            }

            buffer.append('\n');

        }

        System.out.print(buffer.toString());

    }

}