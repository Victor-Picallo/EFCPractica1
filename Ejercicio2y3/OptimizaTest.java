package Ejercicio2y3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class OptimizaTest {
    @Test
    void testBusca() {
        Optimiza optimiza = new Optimiza();
        boolean r = optimiza.busca("Hola");
        assertTrue(r);
    }

    @Test
    void testBuscaNoEsta() {
        Optimiza optimiza = new Optimiza();
        boolean r = optimiza.busca("Jaime");
        assertFalse(r);
    }

    @Test
    void testCuentaFrasesMinimoLetras() {
        Optimiza optimiza = new Optimiza();
        int r = optimiza.cuentaFrasesMinimoLetras(4);
        assertEquals(6, r);
    }

    @Test
    void testMediaCaracteres() {
        Optimiza optimiza = new Optimiza();
        float r = optimiza.mediaCaracteres();
        assertEquals(7.33, r, 0.01);
    }
}
