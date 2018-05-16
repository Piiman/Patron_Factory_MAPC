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
public class Sony implements Telefono{
    private String Procesador;
    private int RAM;
    private String SO;

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

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    
    
    public Sony(String Procesador, int RAM, String SO) {
        this.Procesador = Procesador;
        this.RAM = RAM;
        this.SO = SO;
    }
    
    
}
