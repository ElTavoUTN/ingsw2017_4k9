package tp5ingsw4k9;
//prueba ok
//

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NivelTest {

    public NivelTest() {
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
     * Test of getNumeroNivel method, of class Nivel.
     */
    /**
     * Test of setNumeroNivel method, of class Nivel.
     */
    @Test
    public void testGetNumeroNivel() {
        System.out.println("getNumeroNivel");
        Nivel instance = null;
        int expResult = 0;
        int result = instance.getNumeroNivel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Nivel instance = new Nivel();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Nivel instance = new Nivel();
        instance.setDescripcion(descripcion);
    }

    @Test
    public void testGetRangoDesde() {
        System.out.println("getRangoDesde");
        Nivel instance = new Nivel();
        int expResult = 0;
        int result = instance.getRangoDesde();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetRangoDesde() {
        System.out.println("setRangoDesde");
        int rangoDesde = 0;
        Nivel instance = new Nivel();
        instance.setRangoDesde(rangoDesde);
    }

    @Test
    public void testGetRangoHasta() {
        System.out.println("getRangoHasta");
        Nivel instance = new Nivel();
        int expResult = 100;
        int result = instance.getRangoHasta();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetRangoHasta() {
        System.out.println("setRangoHasta");
        int rangoHasta = 22;
        Nivel instance = new Nivel();
        instance.setRangoHasta(rangoHasta);

    }

    @Test
    public void testCrearNivel() {
        System.out.println("crearNivel");
        String desc = "Basico";
        int rDesde = 1;
        int rHasta = 100;
        boolean expResult = true;
        boolean result = Nivel.crearNivel(desc, rDesde, rHasta);
        assertEquals(expResult, result);
    }

}
