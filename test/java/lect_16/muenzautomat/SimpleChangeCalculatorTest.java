package lect_16.muenzautomat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleChangeCalculatorTest {
    public static boolean compareArrays(int[] firstArray,int[] secondArray){
        if(firstArray.length != secondArray.length){
            return false;
        }
        else{
            for(int i = 0; i<firstArray.length; i++){
                if(firstArray[i] != secondArray[i]){
                    return false;
                }
            }
            return true;
        }
    }

    public static SimpleChangeCalculator initCalculator(){
        SimpleChangeCalculator Calculator = new SimpleChangeCalculator();
        return Calculator;
    }

    @Test
    public void getChangeTest1(){
        //Array -> 5,50
        int[] testArray = {0,0,0,0,0,1,1,2};
        assertTrue(compareArrays(testArray,initCalculator().getChange(5,50)));
    }
    @Test
    public void getChangeTest2(){
        //Array -> 1,06
        int[] testArray = {1,0,1,0,0,0,1,0};
        assertTrue(compareArrays(testArray,initCalculator().getChange(1,6)));
    }
    @Test
    public void getChangeTestFalse(){
        //Array -> 6,51
        int[] testArray = {1,0,1,0,0,1,6,0};
        assertFalse(compareArrays(testArray,initCalculator().getChange(1,6)));
    }
}