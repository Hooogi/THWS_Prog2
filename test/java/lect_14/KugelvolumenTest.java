package lect_14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KugelvolumenTest {

    @Test
    public void testBerechneKugelVolumen(){
        assertEquals(0,Kugelvolumen.berechneKugelvolumen(0));
        assertEquals(4.0/3* Math.PI, Kugelvolumen.berechneKugelvolumen(1));
        assertEquals(4.0/3*Math.PI*5*5*5, Kugelvolumen.berechneKugelvolumen(5), 0.0001);
    }

    @Test
    public void testBerechneKugelVolumenException(){
        try{
            Kugelvolumen.berechneKugelvolumen(-1);
            fail("expected Exception");
        }
        catch(RuntimeException e){
            assertEquals("Radius kleiner 0", e.getMessage());
        }
    }
}