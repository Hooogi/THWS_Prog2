package lect_14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreckeTest {

    @Test
    public void testConstructor(){
        try{
            Strecke testStrecke = new Strecke(3,7);
            assertEquals(3, testStrecke.start);
            assertEquals(7, testStrecke.end);
        }
        catch(RuntimeException e){
            fail("no exception expected");
        }
    }

    @Test
    public void testConstructorSwap(){
        try{
            Strecke testStrecke = new Strecke(9,4);
            assertEquals(4, testStrecke.start);
            assertEquals(9, testStrecke.end);
        }
        catch(RuntimeException e){
            fail("no exception expected");
        }
    }

    @Test
    public void testConstructorException(){
        try{
            Strecke testStrecke = new Strecke(-9,4);
            fail("exception expected");
        }
        catch(RuntimeException e){
            assertEquals("parameter must be a positive integer", e.getMessage());
        }
    }

    @Test
    public void testOverlap(){
        try{
            Strecke firstStrecke = new Strecke(3,9);
            Strecke secondStrecke = new Strecke(5,12);

            assertTrue(Strecke.overlap(firstStrecke, secondStrecke));
            assertTrue(Strecke.overlap(secondStrecke,firstStrecke));
        }
        catch(RuntimeException e){
            fail("no exception expected");
        }
    }

    @Test
    public void testToString(){
        try{
            Strecke firstStrecke = new Strecke(3,9);
            Strecke secondStrecke = new Strecke(4,4);
            assertEquals("3------9", firstStrecke.toString());
            assertEquals("4", secondStrecke.toString());
        }
        catch(RuntimeException e){
            fail("no exception expected");
        }
    }
}