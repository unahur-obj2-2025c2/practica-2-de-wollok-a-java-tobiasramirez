package me.gonzager.ex.operaciones;

public class Vigilancia extends Mision {
    @Override
        public
        int extra(Dron dron) {
            if (dron.getTieneMejoras()) {
                return dron.getAutonomia() * 2;
            } else {
                return dron.getCapacidad();
            }
        }
    @Override 
    public Boolean comprobarAvanzado(Dron dron) {
        return dron.sensoresDuraderos();
    }
    }
