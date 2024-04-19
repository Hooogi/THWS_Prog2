package lect_16.ex_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoboterImplTest {

    private Actions initRoboterAndReact(Dangerzone danger){
        RoboterImpl c3po = new RoboterImpl();
        return c3po.entscheide(danger);
    }

    @Test
    public void testeGefahrRechts(){
        assertEquals(Actions.LINKS.name(),initRoboterAndReact(Dangerzone.GEFAHR_RECHTS).name());
    }

    @Test
    public void testeGefahrLinks(){
        assertEquals(Actions.RECHTS.name(),initRoboterAndReact(Dangerzone.GEFAHR_LINKS).name());
    }

    @Test
    public void testeGefahrVorne(){
        assertEquals(Actions.ABBREMSEN.name(),initRoboterAndReact(Dangerzone.GEFAHR_VORNE).name());
    }
}