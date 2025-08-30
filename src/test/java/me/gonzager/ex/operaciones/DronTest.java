package me.gonzager.ex.operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import me.gonzager.ex.operaciones.Dron.DronComercial;
import me.gonzager.ex.operaciones.Mision.Exploracion;
import me.gonzager.ex.operaciones.Dron.*;

public class DronTest {
    @Test 
    void queSePuedaInstanciarUnDronComercial() {
        Dron dronC = new DronComercial(15, 20);
        assertEquals(DronComercial.class, dronC.getClass());
    }
     @Test 
    void queSePuedaInstanciarUnDronSeguridad() {
        Dron dronC = new DronSeguridad(15,  20);
        assertEquals(DronComercial.class, dronC.getClass());
    }
    @Test
    void eficienciaOperativaDronComercial() {
        Exploracion mision = new Exploracion();
        Dron dronC = new DronComercial(15, 20);
        dronC.setMision(mision);
        assertEquals()
    }
}
