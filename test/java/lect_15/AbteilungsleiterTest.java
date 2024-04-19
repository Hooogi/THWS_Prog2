package lect_15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbteilungsleiterTest {

    @Test
    public void testCreateInstance(){
        try{
            Abteilungsleiter Test = new Abteilungsleiter("Langpeter", "Peter", 1337, 69420, "06.01.1997");
            assertEquals("Langpeter", Test.name);
        }
        catch(RuntimeException e){
            fail();
        }
    }

    @Test
    public void testPromoteEmployee(){
        try{
            Abteilungsleiter testLeiter = new Abteilungsleiter("Langpeter", "Peter",1337, 69420, "06.01.1997");
            Angestellter testEmployee = new Angestellter("Goshi", "Denis", 187, 666, "10.01.2004");
            testLeiter.promote(testEmployee);
            assertEquals(1.1, testEmployee.payment_factor, 0.0001);
        }
        catch(RuntimeException e){
            fail();
        }
    }

    @Test
    public void testCalculatePayment(){
        Abteilungsleiter testLeiter = new Abteilungsleiter("Langpeter", "Peter",1337, 69420, "06.01.1997");
        assertEquals(69420*2, testLeiter.calculatePayment(), 0.0001);
    }


}