package me.gonzager.ex.operaciones;

public class DronComercial extends Dron {
    @Override 
     public int eficiencia() {
        return super.eficiencia() + 15;
    }
  
}
