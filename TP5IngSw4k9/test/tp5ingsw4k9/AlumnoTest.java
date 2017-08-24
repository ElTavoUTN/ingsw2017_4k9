package tp5ingsw4k9;

import org.junit.Test;
import static org.junit.Assert.*;

public class AlumnoTest {
       
    @Test
    public void testCalcularNuevoNivel() {
        System.out.println("calcularNuevoNivel");
        int puntajeActual = 250;
        int expResult = 3;
        int result = Alumno.calcularNuevoNivel(puntajeActual);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
