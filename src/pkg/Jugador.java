/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

/**
 *
 * @author ifram
 */
public class Jugador {

    private final int id;
    private final String nombre;
    private int partidasGanadas;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        partidasGanadas = 0;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void ganarPartida() {
        partidasGanadas++;
    }

    public void resetPartidas() {
        partidasGanadas = 0;
    }
}
