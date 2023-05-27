/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconecta4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FutuzorMekkla
 */
public class Conecta4Test {

    public Conecta4Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testHuecoDisponible() {
        System.out.println("huecoDisponible");
                Conecta4 c4 = new Conecta4();
        assertTrue(c4.huecoDisponible(3) == true);
    }

    @Test
    public void testAñadirFicha() {
        System.out.println("a\u00f1adirFicha");
        int columna = 3;
        ColorFicha ficha = ColorFicha.ROJO;
        Conecta4 c4 = new Conecta4();
        c4.añadirFicha(columna, ficha);
    }

    @Test
    public void testImprimirTablero() {
        System.out.println("imprimirTablero");
    }

    @Test
    public void testComprobarGanador() {
        System.out.println("comprobarGanador");
        Conecta4 instance = new Conecta4();
        boolean expResult = false;
        boolean result = instance.comprobarGanador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testDevolverFicha() {
        System.out.println("devolverFicha");
        int fila = 0;
        int columna = 0;
        Conecta4 instance = new Conecta4();
        ColorFicha expResult = null;
        ColorFicha result = instance.devolverFicha(fila, columna);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
