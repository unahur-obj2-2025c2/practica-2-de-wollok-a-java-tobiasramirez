package me.gonzager.ex.operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.gonzager.CiudadFuturista;
import me.gonzager.ex.operaciones.Dron.DronComercial;
import me.gonzager.ex.operaciones.Mision.*;
import java.util.ArrayList;
import java.util.List;

public class EscuadronTest {
    Sensor sensor
    Vigilancia misionVigilancia = new Vigilancia(sensores:);
    DronComercial dronCom1 = new DronComercial(50, misionVigilancia, 15) ;
    Escuadron escuadron1 = new Escuadron(java.util.Arrays.asList(dronCom1));
    CiudadFuturista zona1 = new CiudadFuturista(12);

    @BeforeEach
    private void init() {

    }

    @Test()
    void operarZona() {
        escuadron1.operarZona(zona1);
        assertEquals(1, zona1.getOperacionesRecibidas());
    }

}
