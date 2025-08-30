package me.gonzager;

public class CiudadFuturista {
    private Integer maximoDrones = 10;
    private Integer operacionesRecibidas = 0;

    
    public Integer getOperacionesRecibidas() {
        return operacionesRecibidas;
    }

    private Integer tamañoTotal;

    public Integer getTamañoTotal() {
        return tamañoTotal;
    }

    public Integer getMaximoDrones() {
        return maximoDrones;
    }

    public void setMaximoDrones(Integer maximoDrones) {
        this.maximoDrones = maximoDrones;
    }
    public void recibirOperacion() {
        operacionesRecibidas += 1;
    }

    public CiudadFuturista(Integer tamañoTotal) {
        this.tamañoTotal = tamañoTotal;
    }
    
}
