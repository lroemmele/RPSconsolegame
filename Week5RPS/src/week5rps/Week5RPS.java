/*
Rock paper sissiors game.
user has the option to play head to head with another player, or vs computer.
first player to reach 5 more wins then the other wins the game. 
user will be promt to play again or quit.

 */
package week5rps;

/**
 *
 * @author lroem
 */
public class Week5RPS {

    /*
    main control loop for the game.
    Game runs until winner is found and user chosses to play again or not
    */
    public static void main(String[] args) {
        //feilds for storing players wins for counter
        int winningCount;
        int player1Wins = 0;
        int player2Wins = 0;
        int compWins = 0;
        
        //feilds for controling both main loop and the play agian loop, also first pass flag for displaying title and instructions
        int continueGame = 1;
        int playAgain = 1;
        int firstPass = 1;
        int userGameSelection = -1;
        
        while(playAgain == 1){
            while(continueGame ==1){
                //if first pass though loop title and insturctions will display
                //TitleText.txt and PlayerOrComputer files are read in 
                if (firstPass == 1){
                FileOpenClass titleFile = new FileOpenClass();
                titleFile.openFile("C:/Users/lroem/Google Drive/phoenix/PRG215/week 5/Week5RPS/src/week5rps/res/TitleText.txt");
                titleFile.readFile();
                titleFile.closeFile();

                FileOpenClass gameMode = new FileOpenClass();
                gameMode.openFile("C:/Users/lroem/Google Drive/phoenix/PRG215/week 5/Week5RPS/src/week5rps/res/PlayerOrComputer");
                gameMode.readFile();
                gameMode.closeFile();
                firstPass = 0;                      //marks first pass and will not display title unless new game

                
                //calls gamemodeselection class to pick head to hear, or vs computer returns value to userGameSelection
                GameModeSelection chooseGameMode = new GameModeSelection();
                userGameSelection = chooseGameMode.getUserSelection();
                }
                
                //calls RPSGamePlay main class for running game logic
                RPSGamePlay gamePlay = new RPSGamePlay();
                gamePlay.gamePlay(userGameSelection);

                //pass winner value in to winningCount and increments player1, player2, or computer wins
                winningCount = gamePlay.winnerSelect();

                switch(winningCount){
                    case 1: 
                        player1Wins++;
                        break;
                    case 2:
                        player2Wins++;
                        break;
                    case 3:
                        compWins++;
                        break;
                }
                
                //calls rpsgameplay class and displays current win total and compares to see if there is a winner,
                //if winner continuegame is marked 0 and breaks loop
                continueGame = gamePlay.displayerWinnersStats(player1Wins, player2Wins, compWins);

            }
            //resets loop flag and firstpass flag
            continueGame = 1;
            firstPass = 1;
            //calls repeatgameagain and ask user if they want to play agian
            RepeatGameAgain repeat = new RepeatGameAgain();
            playAgain = repeat.repeatGame();
        }
    }
    
}
