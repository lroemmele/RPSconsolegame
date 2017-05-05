
package week5rps;

/*
this class takes in values to compare rock paper sissors logic
and returns winner value
*/
public class CompareRPS {
    int winner;
    //rock 1
    //paper 2
    //sissors 3
    public int rpsCompare(int user1, int user2){
        //System.out.println(user1 +"   "+ user2);
        
        switch(user1){
            case 1:
                //System.out.println("user1 rock");
                switch(user2){
                    case 1:
                        winner = 0;
                        break;
                    case 2:
                        winner = 2;
                        break;
                    case 3:
                        winner = 1;
                        break;
                }
                break;
            case 2:
                //System.out.println("user1 paper");
                switch(user2){
                    case 1:
                        winner = 1;
                        break;
                    case 2:
                        winner = 0;
                        break;
                    case 3:
                        winner = 2;
                        break;
                }
                break;
            case 3:
                //System.out.println("user1 siss");
                switch(user2){
                    case 1:
                        winner = 2;
                        break;
                    case 2:
                        winner = 1;
                        break;
                    case 3:
                        winner = 0;
                        break;
                }
                break;
        }
        
        return winner;
    }
}
