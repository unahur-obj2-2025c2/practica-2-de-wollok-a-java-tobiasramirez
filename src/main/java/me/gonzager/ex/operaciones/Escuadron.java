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
   
   public void añadirDron(Dron dron) {
    drones.add(dron);
   }
   public void eliminarDron(Dron dron) {
    drones.remove(dron);
   }
   public void costoOperacion() {
    drones.forEach(d->d.disminuirAutonomia());
   }

   public void operarZona(CiudadFuturista zona) {
    if (this.puedeOperar(zona)) {
        zona.recibirOperacion();
        this.costoOperacion();
    }
   }
}
