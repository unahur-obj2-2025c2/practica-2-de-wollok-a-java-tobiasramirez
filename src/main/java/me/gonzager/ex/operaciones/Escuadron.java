package me.gonzager.ex.operaciones;

import java.util.ArrayList;
import java.util.List;

import me.CiudadFuturista;
import me.gonzager.ex.operaciones.Dron.Dron;

public class Escuadron {
   private List<Dron> drones = new ArrayList<>();

   public Escuadron(List<Dron> drones) {
    this.drones = drones;
   }

   public Boolean puedeOperar(CiudadFuturista zona) {
        return drones.stream().anyMatch(d->d.esAvanzado());
   }
   
}
