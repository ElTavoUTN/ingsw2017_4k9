package tp5ingsw4k9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProfesorTest {
    
    public ProfesorTest() {
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
     * Test of altaProfesor method, of class Profesor.
     */
    @Test
    public void testAltaProfesor() {
        System.out.println("Alta Profesor");
        String us = "Oscar";      
        String con = "123456789";
        String nomb = "Oscar Leon";
        int cuil = 252346;
        boolean expResult = false;
        boolean result = Profesor.altaProfesor(us, con, nomb, cuil);
        assertEquals(expResult, result);
    }
    
}
