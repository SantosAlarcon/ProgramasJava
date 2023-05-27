/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

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
public class UtilidadesArrayTest {

    public UtilidadesArrayTest() throws Exception {
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
    public void testAñadirNumeroArray() throws Exception {
        System.out.println("a\u00f1adirNumeroArray");
        UtilidadesArray e = new UtilidadesArray(5);
        e.añadirNumeroArray(5);
        e.añadirNumeroArray(44);
        e.añadirNumeroArray(86);
        System.out.println(e.toString());

    }

}