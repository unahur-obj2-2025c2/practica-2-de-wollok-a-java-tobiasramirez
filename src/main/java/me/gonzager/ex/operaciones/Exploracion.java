package me.gonzager.ex.operaciones;

public class Exploracion extends Mision {
  @Override
  public Boolean comprobarAvanzado(Dron dron) {
    return dron.eficiencia() % 2 == 0;
  }
}
