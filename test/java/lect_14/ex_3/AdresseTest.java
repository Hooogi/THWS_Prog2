package lect_14.ex_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdresseTest {

    @Test
    public void testConstructorAdresse(){
        try{
            Adresse test = new Adresse("Sonnenweg", "12", 97816, "Lohr am Main");
        }
        catch(RuntimeException e) {
            fail("no exception expected");
        }
    }

    @Test
    public void testConstructorAdresse_invalidStreet(){
        try{
            Adresse test = new Adresse("sonnenweg", "12", 97816, "Lohr am Main");
            fail("exception expected");
        }
        catch(RuntimeException e) {
            assertEquals("invalid streetname", e.getMessage());
        }
    }

    @Test
    public void testConstructorAdresse_invalidCity(){
        try{
            Adresse test = new Adresse("Sonnenweg", "12", 97816, "lohr am Main");
            fail("exception expected");
        }
        catch(RuntimeException e) {
            assertEquals("invalid cityname", e.getMessage());
        }
    }

    @Test
    public void testConstructorAdresse_invalidNumber(){
        try{
            Adresse test = new Adresse("Sonnenweg", "A12", 97816, "Lohr am Main");
            fail("exception expected");
        }
        catch(RuntimeException e) {
            assertEquals("invalid number", e.getMessage());
        }
    }


}