package co.com.display.lcd.utilidades;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DisplayTest {

    @Test
    public void getDigitoComoMatriz() {
    }

    @Test
    public void llenarLadoSuperiorHorizontal() {
        // Arrange
        char[][] matrizDigito = new char[5][3];
        int fila = 0;
        // Act
        Display.llenarLado(matrizDigito, Display.Lado.HORIZONTAL_SUPERIOR);
        // Assert
        assertEquals(0, matrizDigito[fila][0]);
        assertEquals('-', matrizDigito[fila][1]);
        assertEquals(0, matrizDigito[fila][2]);
    }

    @Test
    public void llenarLadoIntermedioHorizontal() {
        // Arrange
        char[][] matrizDigito = new char[5][3];
        int fila = 2;
        // Act
        Display.llenarLado(matrizDigito, Display.Lado.HORIZONTAL_INTERMEDIO);
        // Assert
        assertEquals(0, matrizDigito[fila][0]);
        assertEquals('-', matrizDigito[fila][1]);
        assertEquals(0, matrizDigito[fila][2]);
    }

    @Test
    public void llenarLadoInferiorHorizontal() {
        // Arrange
        char[][] matrizDigito = new char[5][3];
        int fila = 4;
        // Act
        Display.llenarLado(matrizDigito, Display.Lado.HORIZONTAL_INFERIOR);
        // Assert
        assertEquals(0, matrizDigito[fila][0]);
        assertEquals('-', matrizDigito[fila][1]);
        assertEquals(0, matrizDigito[fila][2]);
    }

    @Test
    public void llenarLadoSuperiorIzquierdoVertical() {
        // Arrange
        char[][] matrizDigito = new char[5][3];
        int columna = 0;
        // Act
        Display.llenarLado(matrizDigito, Display.Lado.VERTICAL_IZQUIERDO_SUPERIOR);
        // Assert
        assertEquals(0, matrizDigito[0][columna]);
        assertEquals('|', matrizDigito[1][columna]);
        assertEquals(0, matrizDigito[2][columna]);
    }

    @Test
    public void llenarLadoInferiorIzquierdoVertical() {
        // Arrange
        char[][] matrizDigito = new char[5][3];
        int columna = 0;
        // Act
        Display.llenarLado(matrizDigito, Display.Lado.VERTICAL_IZQUIERDO_INFERIOR);
        // Assert
        assertEquals(0, matrizDigito[2][columna]);
        assertEquals('|', matrizDigito[3][columna]);
        assertEquals(0, matrizDigito[4][columna]);
    }

    @Test
    public void llenarLadoSuperiorDerechoVertical() {
        // Arrange
        char[][] matrizDigito = new char[5][3];
        int columna = 2;
        // Act
        Display.llenarLado(matrizDigito, Display.Lado.VERTICAL_DERECHO_SUPERIOR);
        // Assert
        assertEquals(0, matrizDigito[0][columna]);
        assertEquals('|', matrizDigito[1][columna]);
        assertEquals(0, matrizDigito[2][columna]);
    }

    @Test
    public void llenarLadoInferiorDerechoVertical() {
        // Arrange
        char[][] matrizDigito = new char[5][3];
        int columna = 2;
        // Act
        Display.llenarLado(matrizDigito, Display.Lado.VERTICAL_DERECHO_INFERIOR);
        // Assert
        assertEquals(0, matrizDigito[2][columna]);
        assertEquals('|', matrizDigito[3][columna]);
        assertEquals(0, matrizDigito[4][columna]);
    }

    @Test
    public void LectorEntrada(){
        //Arrange
        String entrada = "1,2,3";
        //Act
        LectorEntrada.validarEntrada(entrada);
        boolean resultado = LectorEntrada.validarEntrada(entrada);
        //Assert
        assertFalse(resultado);
    }

    @Test
    public void Display(){
        //Arrange

        //Act

        //Assert

    }

}