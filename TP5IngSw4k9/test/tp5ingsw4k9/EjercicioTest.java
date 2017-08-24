
package tp5ingsw4k9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EjercicioTest {
    
    public EjercicioTest() {
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
     * Test of Ejercicio method, of class Ejercicio.
     */
    @Test
    public void testEjercicio() {
        System.out.println("Ejercicio");
        int codEj = 0;
        String expresion = "";
        int resultado = 0;
        Nivel nivelEj = null;
        int calificacion = 0;
        Ejercicio instance = new Ejercicio();
        boolean expResult = false;
        boolean result = instance.Ejercicio(codEj, expresion, resultado, nivelEj, calificacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
