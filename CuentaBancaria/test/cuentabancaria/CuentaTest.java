/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentabancaria;

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
public class CuentaTest {

    public CuentaTest() {
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
        Cuenta cnt = null;
    }

    @Test
    public void testIngresarPasta() {
        System.out.println("ingresarPasta");
        Cuenta cnt = new Cuenta("eeeeee");
        cnt.ingresarPasta(53f);
        cnt.ingresarPasta(57f);

        assertTrue(cnt.getSaldo() == 110f);
    }

    @Test
    public void testRetirarPasta() {
        System.out.println("retirarPasta");
        Cuenta cnt = new Cuenta("eeeeee");
        cnt.setSaldo(500f);
        cnt.retirarPasta(120f);
        cnt.retirarPasta(60f);

        assertTrue(cnt.getSaldo() == 320f);
    }

    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Cuenta cnt = new Cuenta("eeeeee");
        cnt.setSaldo(6400f);

        assertTrue("El saldo es mayor que el disponible.", cnt.getSaldo() == 6400f);
    }

    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Cuenta instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetNCC() {
        System.out.println("getNCC");
        Cuenta instance = null;
        String expResult = "";
        String result = instance.getNCC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetNCC() {
        System.out.println("setNCC");
        String NCC = "";
        Cuenta instance = null;
        instance.setNCC(NCC);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        float saldo = 0.0F;
        Cuenta instance = null;
        instance.setSaldo(saldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetTitular() {
        System.out.println("getTitular");
        Cuenta instance = null;
        String expResult = "";
        String result = instance.getTitular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetTitular() {
        System.out.println("setTitular");
        String titular = "";
        Cuenta instance = null;
        instance.setTitular(titular);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}