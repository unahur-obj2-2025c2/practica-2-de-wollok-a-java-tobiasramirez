package me.gonzager.ex.operaciones.Dron;

import me.gonzager.ex.operaciones.Mision.Mision;

public abstract class Dron {
    protected Integer autonomia;
    protected Mision mision;
    protected Integer procesamiento;
    


    public Integer getProcesamiento() {
        return procesamiento;
    }
  public Integer getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
  public Integer eficiencia() {
    return autonomia * 10 + mision.extra(this);
  }
  public Mision getMision() {
    return mision;
  }
  public void setMision(Mision mision) {
    this.mision = mision;
  }
  public Boolean esAvanzado() {
    return this.avanzado() || mision.comprobarAvanzado(this);
  }
  public abstract Boolean avanzado();
  public Boolean esAvanzadoEnSuMision(){
    return mision.comprobarAvanzado(this);
  }
  public void disminuirAutonomia() {
    autonomia -= 2;
  }
 
}
