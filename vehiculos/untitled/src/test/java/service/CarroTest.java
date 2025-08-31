package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarroTest {

    private Carro carro;

    @Before
    public void before() {
        carro = new Carro();
    }

    @Test
    public void testCambiarLlantasDelanteroPiloto() {
        Llanta esperado = new Llanta(20);


        carro.cambiarLlanta(0, esperado);
        Llanta obtenido = carro.getLlanta(0);

        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String obtenido = carro.toString().toLowerCase();
        assertTrue(obtenido.contains("llantas"));
    }
}
