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
public class Motorola implements Telefono{
    private String Procesador;
    private int RAM;
    private String Camara;

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

    public String getCamara() {
        return Camara;
    }

    public void setCamara(String Camara) {
        this.Camara = Camara;
    }

    
    
    public Motorola(String Procesador, int RAM, String Camara) {
        this.Procesador = Procesador;
        this.RAM = RAM;
        this.Camara = Camara;
    }
    
    
}
