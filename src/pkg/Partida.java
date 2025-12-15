/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

/**
 *
 * @author ifram
 */
public class Partida {

    private static final int MAXIMO_INTENTOS = 6;

    private final String palabra;
    private final CanvasAhorcado canvas;

    private int numIntentos;

    public Partida(String palabra, Jugador adivinador, Jugador retador, CanvasAhorcado canvas) {
        this.palabra = palabra;
        this.canvas = canvas;

        numIntentos = MAXIMO_INTENTOS;
    }

    public char[] comprobarPalabra(char[] intento) {
        numIntentos--;

        var palabraCaracterizada = palabra.toCharArray();
        var numCaracteres = palabraCaracterizada.length;

        char[] respuesta = new char[numCaracteres];

        for (char item : intento) {
            for (int j = 0; j < numCaracteres; j++) {
                respuesta[j] = ' ';
                if (item == palabraCaracterizada[j]) {
                    respuesta[j] = item;
                }
            }

        }
        return respuesta;
    }

    public int getNumIntentos() {
        return numIntentos;
    }
}
