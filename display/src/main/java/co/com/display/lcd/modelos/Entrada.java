package co.com.display.lcd.modelos;

public class Entrada {

    private int size;

    private char[] digitos;

    // Constructor de la clase.
    public Entrada(int size, char[] digitos) {

        this.size = size;

        this.digitos = digitos;

    }

    // Métodos getter y setter.

    public int getSize() {

        return size;

    }

    public void setSize(int size) {

        this.size = size;

    }

    public char[] getDigitos() {

        return digitos;

    }

    public void setDigitos(char[] digitos) {

        this.digitos = digitos;

    }

}