package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LlantaTest {

    private Llanta llanta;

    @Before
    public void before() {
        llanta = new Llanta();
    }

    @Test
    public void testSetRinNegativo() {
        llanta.setRin(-5);
        int esperado = 10;
        int obtenido = llanta.getRin();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testSetRinValido() {
        llanta.setRin(18);
        int esperado = 18;
        int obtenido = llanta.getRin();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        llanta.setRin(16);
        String esperado = "Llanta(rin=16)";
        String obtenido = llanta.toString();
        assertEquals(esperado.toLowerCase(), obtenido.toLowerCase());
    }

    @Test
    public void testEquals() {
        Llanta otra = new Llanta(15);
        llanta.setRin(15);

        assertTrue(llanta.equals(otra));
        assertFalse(llanta.equals(new Llanta(20)));
    }
}
