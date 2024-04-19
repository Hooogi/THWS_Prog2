package lect_14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PunktTest {

    public String initAndMoveCatchException(int x, int y){
        try{
            Punkt test2 = new Punkt(1,1);
            test2.verschiebePunkt(x, y);
            fail("expected Exception");
        }
        catch(RuntimeException e){
            String exception = e.getMessage();
            return exception;
        }
        return null;
    }

    @Test
    public void testVerschiebePunkt(){
       Punkt test = new Punkt(1,1);
       test.verschiebePunkt(1000,800);
       assertEquals(1000,test.x);
       assertEquals(800,test.y);
    }

    @Test
    public void testVerschiebePunkt_LessThanNull(){
        try{
            Punkt test2 = new Punkt(1,1);
            test2.verschiebePunkt(-12, 800);
            fail("expected Exception");
        }
        catch(RuntimeException e){
            assertEquals("input less than zero", e.getMessage());
        }
    }

    @Test
    public void testVerschiebePunkt_xGreater1920(){
            assertEquals("x greater than 1920", initAndMoveCatchException(2000,700));
    }

    @Test
    public void testVerschiebePunkt_yGreater1080(){
            assertEquals("y greater than 1080", initAndMoveCatchException(400,1600));
    }
}