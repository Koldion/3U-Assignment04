
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wangk9757
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    
         int spot = 1;
 
        //Create a loop to start and end the game
         while (spot < 100) {
             //ask user for sum of dice
             System.out.println("What number did you roll?");
             //set input into roll 
             int roll = input.nextInt();
             spot = spot + roll ;
             //if the dice is 0 then terminate
             if (roll < 2){
                 System.out.println("You have forfeit");
                 break;}
             if (roll > 12){
                 System.out.println("You forfeit loser");
                 break;}
             //get the player to move by adding dice with player
             
             
             //make if statement in case player lands on ladder or snake
            if (spot == 9) {
                 System.out.println("Ladder");
                 spot = spot + 25;
           }
             if (spot == 40) {
                 System.out.println("Ladder");
                 spot = spot + 24;
             }
             if (spot == 67) {
                 System.out.println("Ladder");
                 spot = spot + 19;
            }
             if (spot == 54) {
                System.out.println("Snake");
                 spot = spot - 35;
             }
             if (spot == 90) {
                 System.out.println("Snake!");
                 spot =spot - 42;
             }
             if (spot == 99) {
                 System.out.println("Snake");
                 spot = spot - 22;
             }
            if (spot == 100) {
                //tell em they won, now make fun of them 
                System.out.println("You have won, now do something with your life");
               
                break;
             }
     
             //tell player where he is on the board
             System.out.println("You are now on square " + spot);
 
        }
     }
        

}
