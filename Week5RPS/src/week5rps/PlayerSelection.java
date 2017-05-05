
package week5rps;

import java.util.Scanner;
/*
class promts user to select rock paper or sissors, if incorrect entry user will be promt to enter again
then returns value
*/

public class PlayerSelection {
    public int playerSelectRPS(int player){
        Scanner sc = new Scanner(System.in);
        
        int rpsPicked = 0;
        char userEntry = 0;
      
        
        while((userEntry != 'R')&&(userEntry != 'P')&&(userEntry != 'S')){
            System.out.println("Make your selection player "+player);
            System.out.println("Must be Rock-Paper-Scissors");
            userEntry = sc.next().charAt(0);  //take input from user at index 0, assigns to player
            userEntry = Character.toUpperCase(userEntry);
            
        }
        
        
        
            switch(userEntry){
                case 'R':
                    rpsPicked = 1;
                    break;
                case 'P':
                    rpsPicked =2;
                    break;
                case 'S':
                    rpsPicked = 3;
                    break;
            }
        
        return rpsPicked;
    }
}
