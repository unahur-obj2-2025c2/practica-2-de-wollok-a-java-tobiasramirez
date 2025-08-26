package me.gonzager.ex.operaciones.Mision;

public class Sensor {
    private Integer capacidad;
    private Double durabilidad;
    private Boolean tieneMejoras;
    public Sensor(Integer capacidad, Double durabilidad, Boolean tieneMejoras) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.tieneMejoras = tieneMejoras;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public Double getDurabilidad() {
        return durabilidad;
    }
    public Boolean getTieneMejoras() {
        return tieneMejoras;
    }
    public Boolean esDuradero() {
        return durabilidad > capacidad*2;
    }
    public Integer extra() {
        if(tieneMejoras) {
            return capacidad * 2;
        } else {
            return capacidad;
        }
    }
}
