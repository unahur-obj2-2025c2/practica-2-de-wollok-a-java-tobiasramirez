package me.gonzager.ex.operaciones.Dron;

import me.gonzager.ex.operaciones.Mision.Mision;

public class DronComercial extends Dron {
    @Override 
     public Integer eficiencia() {
        return super.eficiencia() + 15;
    }

    @Override
    public Boolean avanzado() {
        return false;
    }
   public DronComercial(Integer autonomia, Mision mision, Integer procesamiento ){
    this.autonomia = autonomia;
    this.mision = mision;
    this.procesamiento = procesamiento;
   }
}
