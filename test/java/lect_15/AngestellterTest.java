package lect_15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AngestellterTest {

    @Test
    public void testCreateInstance(){
        try{
            Angestellter Test = new Angestellter("Goshi", "Denis", 187, 666, "10.01.2004");
        }
        catch(RuntimeException e){
            fail();
        }
    }

    @Test
    public void testCalculatePayment(){
        try{
            Angestellter Test = new Angestellter("Goshi", "Denis", 187, 666, "10.01.2004");
            assertEquals(666*1, Test.calculatePayment(), 0.0001);
        }
        catch(RuntimeException e){
            fail();
        }
    }
}