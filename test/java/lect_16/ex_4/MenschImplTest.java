package lect_16.ex_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenschImplTest {
    private static double initAndWinIt(){
        MenschImpl Mensch = new MenschImpl();
        int[] countActions = new int[4];
        Dangerzone[] dangers = Dangerzone.values();

        for(int i = 0; i<10000; i++){
            countActions[Mensch.entscheide(dangers[i%3]).ordinal()]++;
        }
        double sum = 0;
        for(int c : countActions){
            sum+=c;
        }
        return countActions[3]/sum;
    }

    @Test
    public void testEntscheide(){
        assertEquals(0.25,initAndWinIt(),0.2);
    }
}