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
        int a = 5;
        int b = 3;
        int expResult = 8;
        int result = Calculadora.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 18;
        int b = 3;
        int expResult = 15;
        int result = Calculadora.restar(a, b);
        assertEquals(expResult, result);
    }

   
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 3;
        int b = 3;
        int expResult = 9;
        int result = Calculadora.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    
        @Test
    public void testDividirPorCero() {
        System.out.println("dividir por cero");
        int a = 5;
        int b = 0;
        int expResult = 0;
        int result = Calculadora.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 5;
        int b = 2;
        int expResult = 2;
        int result = Calculadora.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of distribucion method, of class Calculadora.
     */
    @Test
    public void testDistribucion() {
        System.out.println("distribucion");
        int a = 3;
        int b = 2;
        int c = 2;
        char o1 = '*';
        char o2 = '-';
        int expResult = 0;
        int result = Calculadora.distribucion(a, b, c, o1, o2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
