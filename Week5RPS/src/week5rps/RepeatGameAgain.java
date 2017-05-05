
package week5rps;

import java.util.Scanner;
/*
promts user to play again or quit and returns valuel
*/


public class RepeatGameAgain {
    public int repeatGame(){
        char userSlection;              //value enter by user for game repeat
        char repeat = 'Y';              //value if repeat
        Scanner sc = new Scanner(System.in);
     
        System.out.println("");
        System.out.println("Would you like to play again?");
        System.out.println("Enter Yes to play again or enter No to quit.");
        userSlection = sc.next().charAt(0);     //take input from user and index 0
        userSlection = Character.toUpperCase(userSlection); //changes value in suerSlection to uppercase
        
        if(userSlection == repeat){     //if user enter yes, 1 is returned
            return 1;           
        }
    
    return 0;                           // if user dose not enter yes, returns 0
    
    }
}
