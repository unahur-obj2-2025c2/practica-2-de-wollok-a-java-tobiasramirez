package me.gonzager.ex.operaciones.Mision;

import me.gonzager.ex.operaciones.Dron.Dron;

public class Transporte implements Mision {
    
    
    @Override
        public 
        Integer extra(Dron dron) {
            return 100;
        }
    @Override
    public  Boolean comprobarAvanzado(Dron dron) {
        return dron.getAutonomia() > 50;
    }
}
