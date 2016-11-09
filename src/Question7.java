
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input for the user
        Scanner input = new Scanner(System.in);
        //get user to input the speed limit

        System.out.println("What was the speed limit ?");
        //save int
        int spdlimit = input.nextInt();

        //get user to input the speed he was travelling at
        System.out.println("How fast were you travelling? ");
        //save int
        int speed = input.nextInt();
        //find how much faster he was than the speed limit
        int over = speed - spdlimit;
        //compare that with the amount of fine
        if (over > 1 && over < 20) {
            System.out.println("WHY YOU SPEED?!? I FINE YOU 100 DOLLARS!! ");
        }//give fine for 270
        if (over > 21 && over < 30) {
            System.out.println("WHYY YOU SPEEEED SOO MUCHHHHH??!?!?!? I FINE YOU 270 DOLLARS! HA! ");
        }//give fine for 500
        if (over > 31) {
            System.out.println(" ... wow dude.... You're getting fined 500 dollars. You disapoint me");
        }//tell them they are not going to get fined 
        if (over < 1) {
            System.out.println("Great Driving! You are under the speed limit! ");
        }               
    }
}
