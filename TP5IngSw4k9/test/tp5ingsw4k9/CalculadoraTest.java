package tp5ingsw4k9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int x = 4;
        int y = 5;
        int expResult = 9;
        int result = Calculadora.sumar(x, y);
        assertEquals(expResult, result);

    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int x = 12;
        int y = 10;
        int expResult = 2;
        int result = Calculadora.restar(x, y);
        assertEquals(expResult, result);

    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int x = 6;
        int y = 2;
        int expResult = 12;
        int result = Calculadora.multiplicar(x, y);
        assertEquals(expResult, result);

    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 7;
        int b = 2;
        int expResult = 3;
        int result = Calculadora.dividir(a, b);
        assertEquals(expResult, result);

    }

    public void testDividirPorCero() {
        System.out.println("dividir Por Cero");
        int a = 7;
        int b = 0;
        int expResult = 0;
        int result = Calculadora.dividir(a, b);
        assertEquals(expResult, result);

    }

    @Test
    public void testDistribucion() {
        System.out.println("distribucion");
        int a = 3;
        int b = 2;
        int c = 2;
        char op1 = '*';
        char op2 = '-';
        int expResult = 0;
        int result = Calculadora.distribucion(a, b, c, op1, op2);
        assertEquals(expResult, result);
    }

}
