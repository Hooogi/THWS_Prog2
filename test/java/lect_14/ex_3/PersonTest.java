package lect_14.ex_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Adresse test = new Adresse("Heinestraße","2",97070,"Würzburg");
    @Test
    public void testConstuctorPerson(){
        try {
            Person Marlene = new Person("Marlene", "Casagranda", test);
        }
        catch(RuntimeException e){
            fail("no Exception expected");
        }
    }

    @Test
    public void testConstuctorPersonException(){
        try {
            Person Tom = new Person("tom", "Hogrefe", test);
            fail("expected Exception");
        }
        catch(RuntimeException e){
            assertEquals("invalid firstname", e.getMessage());
        }
    }
}