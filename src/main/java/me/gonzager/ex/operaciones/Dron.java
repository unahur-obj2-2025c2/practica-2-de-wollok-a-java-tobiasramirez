package me.gonzager.ex.operaciones;
public class Dron {
    private int autonomia;
    public Mision mision;
    public int capacidad;
    public Boolean tieneMejoras;
    public int procesamiento;
    public int durabilidadSensor;

    public int getDurabilidadSensor() {
        return durabilidadSensor;
    }

    public int getProcesamiento() {
        return procesamiento;
    }

    public int getCapacidad() {
        return capacidad;
    }

  public Boolean getTieneMejoras() {
        return tieneMejoras;
    }
  public int getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
  public int eficiencia() {
    return autonomia * 10 + mision.extra(this);
  }
  public Mision getMision() {
    return mision;
  }
  public void setMision(Mision mision) {
    this.mision = mision;
  }
  public Boolean esAvanzado() {
    return false;
  }
  public Boolean esAvanzadoEnSuMision(){
    return mision.comprobarAvanzado(this);
  }
  public Boolean sensoresDuraderos() {
    return getDurabilidadSensor() > capacidad * 2;
  }
}
