/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.ico;

/**
 *
 * @author Miguel
 */
public class Iphone implements Telefono{
    private String Procesador;
    private int RAM;
    private String Memoria;

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getMemoria() {
        return Memoria;
    }

    public void setMemoria(String Memoria) {
        this.Memoria = Memoria;
    }

    
    
    public Iphone(String Procesador, int RAM, String Memoria) {
        this.Procesador = Procesador;
        this.RAM = RAM;
        this.Memoria = Memoria;
    }
    
    
}
