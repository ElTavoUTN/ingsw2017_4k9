package tp5ingsw4k9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlumnoTest {
    
    public AlumnoTest() {
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

    @Test
    public void testAltaAlumno() {
        System.out.println("altaAlumno");
        String us = "Llanca";
        String con = "9876456789";
        int leg = 34783;
        String nomb = "Llanca Crupi";
        int cuilp = 346987687;
        boolean expResult = true;
        boolean result = Alumno.altaAlumno(us, con, leg, nomb, cuilp);
        assertEquals(expResult, result);

    }

    /**
     * Test of cambiarContrasenia method, of class Alumno.
     */
    @Test
    public void testCambiarContrasenia() {
        System.out.println("cambiarContraseña");
        String us = "german0";
        String cont = "1234578";
        Alumno instance = new Alumno();
        boolean expResult = true;
        boolean result = instance.cambiarContrasenia(us, cont);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularNuevoNivel method, of class Alumno.
     */
    @Test
    public void testCalcularNuevoNivel() {
        System.out.println("calcularNuevoNivel");
        int puntajeActual = 350;
        int expResult = 4;
        int result = Alumno.calcularNuevoNivel(puntajeActual);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
