package me.gonzager.ex.operaciones.Mision;

import me.gonzager.ex.operaciones.Dron.Dron;

public class Exploracion implements Mision {
  @Override
  public Boolean comprobarAvanzado(Dron dron) {
    return dron.eficiencia() % 2 == 0;
  }
  @Override public Integer extra(Dron dron) {
    return 0;
  }
}
