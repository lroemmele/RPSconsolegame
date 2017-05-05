
package week5rps;

import java.util.Random;
/*
this class generates random value 1-3 as computers pick for rps and returns value
*/
public class ComputerRPS {
    Random rand = new Random();
    private int compSelection;
    public int computerSelection(){
        compSelection = rand.nextInt(2)+1;
        
        return compSelection;
    }
}
