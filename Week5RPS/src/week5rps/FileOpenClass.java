
package week5rps;

import java.io.*;
import java.util.*;
/*
this class opens filename passed in to it, reads files in to message string, then closes file
*/
public class FileOpenClass {
   private Scanner sc;
   
    public void openFile(String fileName){                             //opens file passed in as argument and input to scanner throws exception if file cant be opened.
        
        try{
            //sc = new Scanner(new File("C:/Users/lroem/Google Drive/phoenix/PRG215/week 5/Week5RPS/src/week5rps/res/TitleText.txt"));
            sc = new Scanner(new File(fileName));
        }
        catch(FileNotFoundException e){
            System.out.println("Could not find file");
        }
    
    }
    
    public void readFile(){                             //takes content title.txt and inputs it to String message
        while(sc.hasNextLine()){
            String message =""; 
            message += sc.nextLine();
          
            System.out.printf("%s\n", message);
        }
    }
    
    public void closeFile(){                            //closes title.txt file
        sc.close();
    } 
}
