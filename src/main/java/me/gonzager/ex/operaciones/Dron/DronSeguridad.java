package me.gonzager.ex.operaciones.Dron;

import me.gonzager.ex.operaciones.Mision.Mision;

public class DronSeguridad extends Dron {
    
  

    @Override
    public Boolean avanzado() {
     return this.getProcesamiento() > 50;
    }
    public DronSeguridad(Integer autonomia, Mision mision, Integer procesamiento ){
    this.autonomia = autonomia;
    this.mision = mision;
    this.procesamiento = procesamiento;
   }
     public DronSeguridad(Integer autonomia,  Integer procesamiento ){
    this.autonomia = autonomia;
    this.procesamiento = procesamiento;
   }
}
