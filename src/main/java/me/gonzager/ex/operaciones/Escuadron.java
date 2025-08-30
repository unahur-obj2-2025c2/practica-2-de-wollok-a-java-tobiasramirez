package me.gonzager.ex.operaciones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.CiudadFuturista;
import me.gonzager.ex.operaciones.Dron.Dron;

public class Escuadron {
   private List<Dron> drones = new ArrayList<>();
   private static Integer cantidadMaximaDrones = 10;

   public static Integer getCantidadMaximaDrones() {
    return cantidadMaximaDrones;
}

   public static void setCantidadMaximaDrones(Integer cantidadMaximaDrones) {
    Escuadron.cantidadMaximaDrones = cantidadMaximaDrones;
   }

   public Escuadron(List<Dron> drones) {
    this.drones = drones;
   }

   public Boolean puedeOperar(CiudadFuturista zona) {
        return drones.stream().anyMatch(d->d.esAvanzado()) && capacidadOperativa() > zona.getTamañoTotal() * 2 ;
   }
   
   public void añadirDron(Dron dron) {
    if(drones.size() == cantidadMaximaDrones) {
        throw new RuntimeException("supera la cantidad maxima definida por la ciudad");

    }
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
   public Double capacidadOperativa() {
    return drones.stream().mapToDouble(d-> d.eficiencia()).sum();
   }
}
