import java.util.Scanner;
import java.util.Date;

/**
 * @author: Kylie Mondello
 * Date:2/22/25
 * This program simulates the Hydra monster by taking a word, removing the first letter of the word
 * (which represents cutting off the head) and adding two copies of the new word to the linked bag
 * (which represents two heads growing back). The program continues to remove the first letter of the word
 * until the word is only one letter long. The program then prints out the time it took to execute the program.
 * Time increases exponentially as the length of the word increases.
 */
public class HydraSimulation {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the word to represent the hydra: ");//Prompts the user to enter a word.
        String startWord = input.nextLine();
        input.close();
        LinkedBag<String> hydra = new LinkedBag<>();
        hydra.add(startWord);
       
        Date current = new Date();
        long startTime = current.getTime();//Starts the time right after the first word is added.
        
        while(hydra.isEmpty() == false) {
            String currentWord = hydra.remove();//remove the first word
            if(currentWord.length() > 1) {//if the word is longer than 1 letter               
                String newWord = currentWord.substring(1 );//remove the first letter
                    hydra.add(newWord);//Add two copies of new word to the bag
                    hydra.add(newWord);
                }
        }
        current = new Date();
        long endTime = current.getTime();//Ends the time after the last word is printed.
        long elapsedTime = endTime - startTime; //Calculates the time it took to excute the hydra program.
        System.out.println("The time it took to execute the hydra program is: " + elapsedTime + " milliseconds.");
    }
}
    

