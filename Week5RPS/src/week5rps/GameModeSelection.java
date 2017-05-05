
package week5rps;

import java.util.Scanner;
/*
promts user to pick head to head, or vs computer and returns value of pick
*/
public class GameModeSelection {
    Scanner sc = new Scanner(System.in);
    private int userSelection;
    
    public int getUserSelection(){
        while((userSelection != 1) && (userSelection != 2)){
            System.out.println("Must Enter 1 or 2");
            while(!sc.hasNextInt()){ 
                System.out.println("Must Enter 1 or 2");
                sc.next();
            }
        userSelection = sc.nextInt();
        }
        return userSelection;
    }
    
    
}
