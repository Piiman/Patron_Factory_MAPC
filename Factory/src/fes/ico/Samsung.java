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
public class Samsung implements Telefono{
    private String Procesador;

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    
    
    public Samsung(String Procesador) {
        this.Procesador = Procesador;
    }

    
}
