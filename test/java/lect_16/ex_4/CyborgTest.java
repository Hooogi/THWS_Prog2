package lect_16.ex_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyborgTest {

    private static double initCybordAndRoll(){
        Cyborg test = new Cyborg();
        int[] countActions = new int[4];
        Dangerzone[] dangers = Dangerzone.values();

        for(int i = 0; i<10000; i++){
            countActions[test.entscheide(dangers[i%3]).ordinal()]++;
        }
        double sum = 0;
        for(int c : countActions){
            sum+=c;
        }
        return countActions[3]/sum;
    }

    @Test
    public void testEntscheide(){
        assertEquals(0.125,initCybordAndRoll(),0.1);
    }

}