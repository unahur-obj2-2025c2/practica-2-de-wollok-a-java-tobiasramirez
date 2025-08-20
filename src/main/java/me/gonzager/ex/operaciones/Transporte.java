package me.gonzager.ex.operaciones;

public class Transporte extends Mision {
    @Override
        public 
        int extra(Dron dron) {
            return 100;
        }
    @Override
    public  Boolean comprobarAvanzado(Dron dron) {
        return dron.getAutonomia() > 50;
    }
}
