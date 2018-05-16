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
public class Redmi implements Telefono{
    private String Procesador;
    private int RAM;
    private String Modelo;

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

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    
    
    public Redmi(String Procesador, int RAM, String Modelo) {
        this.Procesador = Procesador;
        this.RAM = RAM;
        this.Modelo = Modelo;
    }
    
    
}
