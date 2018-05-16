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
public class Factory {
    public static Telefono crearTelefono(String tipo){
        if(tipo.equals(Telefono.IPHONE)){
            return new Iphone("A4", 16, "64GB");
        }
        else if (tipo.equals(Telefono.MOTOROLA)) {
            return new Motorola("Snapdragon 4", 8, "16MP");
        }
        else if (tipo.equals(Telefono.NOKIA)) {
            return new Nokia("Intel", 4, "Windows phone");
        }
        else if (tipo.equals(Telefono.REDMI)) {
            return new Redmi("AMD", 8, "Xiaomi");
        }
        else if (tipo.equals(Telefono.SAMSUNG)) {
            return new Samsung("Snapdragon 820");
        }
        else if (tipo.equals(Telefono.SONY)) {
            return new Sony("Snapodragon 420", 16, "Android");
        }
        else{
            return null;
        }
    }
}
