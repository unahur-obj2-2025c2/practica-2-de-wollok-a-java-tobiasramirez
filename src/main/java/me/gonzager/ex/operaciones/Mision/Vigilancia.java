package me.gonzager.ex.operaciones.Mision;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.Dron.Dron;

public class Vigilancia implements Mision {
    private List<Sensor> sensores = new ArrayList<>();


    @Override
        public
        Integer extra(Dron dron) {
          return sensores.stream().mapToInt(s-> s.extra()).sum();
        }
    @Override 
    public Boolean comprobarAvanzado(Dron dron) {
        return this.sensoresDuraderos();
    }
    public Boolean sensoresDuraderos() {
        return sensores.stream().allMatch(s-> s.esDuradero());
    }
    public Vigilancia(List<Sensor> sensores) {
        this.sensores = sensores;
    }
    
    }
