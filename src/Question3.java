
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input for the user
        Scanner input = new Scanner(System.in);
        //get user to input 4 numbers
        System.out.println("Please enter 4 numbers on seperate lines");

        //get it on seperate lines and as decimals
        double number = input.nextDouble();
        //get the second int
        double number4 = input.nextDouble();
        //get third int
        double number2 = input.nextDouble();
        //get fourth int
        double number3 = input.nextDouble();

        //output the information to the user 
        System.out.println("the numbers you had were " + number + "," + number4 + "," + number2 + "," + number3 + ",");
    }
}
