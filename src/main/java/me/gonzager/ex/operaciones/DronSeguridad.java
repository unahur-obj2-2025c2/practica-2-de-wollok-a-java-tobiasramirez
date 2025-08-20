package me.gonzager.ex.operaciones;

public class DronSeguridad extends Dron {
    @Override
    public Boolean esAvanzado() {
        return this.getProcesamiento() > 50;
    }

}
