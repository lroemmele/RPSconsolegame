
package week5rps;
/*
main logic for game
*/

public class RPSGamePlay {
    
    private int player1;
    private int player2;
    private int comp;
    private int winnerPlayerVSPlayer = -1;
    private int winnerPlayerVSComp = -1;
    
    
    //picks game play based on value passed in from userselection, head to hear or vs comp
    public void gamePlay(int userSelection){
       CompareRPS compare = new CompareRPS();
        switch(userSelection){
           case 1:
               playerVsPlayer();
               winnerPlayerVSPlayer = compare.rpsCompare(player1, player2);
               //System.out.println(winnerPlayerVSPlayer);
               break;
           case 2:
               playerVsComp();
               winnerPlayerVSComp = compare.rpsCompare(player1, comp);
               //System.out.println(winnerPlayerVSComp);
               break;
       }
       
       
    }
    
    //head to head mode passes player number to playerselection class recives value for each users rps
    public void playerVsPlayer(){
        PlayerSelection playerEntry1 = new PlayerSelection();
        player1 = playerEntry1.playerSelectRPS(1);
        
        PlayerSelection playerEntry2 = new PlayerSelection();
        player2 = playerEntry2.playerSelectRPS(2);  
        
    }
    
    //player vs computer mode, passes player number to playerselection class, recieves value from player and computer rps
    public void playerVsComp(){
        PlayerSelection playerEntry1 = new PlayerSelection();
        player1 = playerEntry1.playerSelectRPS(1);
        
        ComputerRPS compRPS = new ComputerRPS();
        comp = compRPS.computerSelection();
        
        //System.out.println(comp);
    
    }
    //displays winner or tie, for both head to head, and vs computer
    public int winnerSelect(){
        int winners = 0;
        if (winnerPlayerVSPlayer != -1){
        
            switch(winnerPlayerVSPlayer){
                
                case 0:
                    System.out.println("Player 1 and Player 2 Tie!\n");
                    break;
                case 1:
                    System.out.println("Player 1 is the WINNER!!!!\n");
                    winners = 1;
                    break;
                case 2:
                    System.out.println("Player 2 is the WINNER!!!!\n");
                    winners = 2;
                    break;
            }
        }else if (winnerPlayerVSComp != -1){
            
            switch(winnerPlayerVSComp){
                case 0:
                    System.out.println("Player 1 and Computer Tie!\n");
                    
                    break;
                case 1:
                    System.out.println("Player 1 is the WINNER!!!!\n");
                    winners = 1;
                    break;
                case 2:
                    System.out.println("Computer Wins!!!!\n");
                    winners =3;
                    break;     
            }
        }
        return winners;
        
    }
    
    //displays stats for game, both head to head, or vs computer
    //if any player is 5 more wins then the other that player wins and values is returned
    public int displayerWinnersStats(int player1, int player2, int computer){
        int roundGameFlag = 1; 
        
        if (winnerPlayerVSPlayer != -1){
            
            System.out.println("Player 1 has "+player1+" wins");
            System.out.println("Player 2 has "+player2+" wins\n");
        }else if (winnerPlayerVSComp != -1){
            System.out.println("Player 1 has "+player1+" wins");
            System.out.println("Computer has "+computer+" wins\n");
        
        }
        
        if(winnerPlayerVSPlayer != -1){
            if ((player1 - player2) >= 5){                                  //if player1 has 5 more wins over player2  then player 1 is the winner sets roundGameFlag to 0
                    System.out.println("Player 1 is the Winner of the game!!!!!!!");
                    roundGameFlag = 0;
                }else if ((player2 - player1) >= 5){
                    System.out.println("Player 2 is the Winner of the game!!!!!!!");        //if player2 has 5 more wins over player1 then player2 is the winner sets roundGameFlag to 0
                    roundGameFlag = 0;
                }
        }else if(winnerPlayerVSComp != -1){
            if ((player1 - computer) >= 5){                                  //if player1 has 5 more wins over comp  then player 1 is the winner sets roundGameFlag to 0
                    System.out.println("Player 1 is the Winner of the game!!!!!!!");
                    roundGameFlag = 0;
                }else if ((computer - player1) >= 5){
                    System.out.println("Computer is the Winner of the game!!!!!!!");        //if comp has 5 more wins over player1 then comp is the winner sets roundGameFlag to 0
                    roundGameFlag = 0;
                }
        }
        return roundGameFlag;
    }
}
