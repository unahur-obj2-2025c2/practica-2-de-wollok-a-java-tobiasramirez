package me.gonzager.ex.operaciones.Mision;

import me.gonzager.ex.operaciones.Dron.Dron;

public interface Mision {
    public Integer extra(Dron dron);

    public abstract Boolean comprobarAvanzado(Dron dron);

    
}
