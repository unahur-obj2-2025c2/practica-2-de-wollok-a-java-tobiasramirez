package me.gonzager.ex.operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import me.gonzager.ex.operaciones.Dron.DronComercial;
import me.gonzager.ex.operaciones.Mision.Exploracion;
import me.gonzager.ex.operaciones.Dron.*;

public class MisionTest {
    @Test
    void testEficienciaOperativaMisionDeExploracion() {
        Exploracion misionEx = new Exploracion();
        Dron dron = new DronComercial(0, 8);
        assertEquals(0, misionEx.extra(dron));
 
    }
    @Test
    void comprobarAvanzado(Dron dron) {
        
    }
}
