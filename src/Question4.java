
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //information that we know :the tickets cost 35 dollars
        //need to divide the cost of everything by 35, the number left will be the number of tickets that need to be sold
        //create input for the user
        Scanner input = new Scanner(System.in);
        //get the user to input the cost of food for prom
        System.out.println("How much will the food cost?");
        //set amount as next int
        int food = input.nextInt();
        //get user to enter the price of a DJ
        System.out.println("How much will the DJ cost?");
        //set amount as next int
        int DJ = input.nextInt();
        //get user to enter price of renting the hall 
        System.out.println("How much will renting the hall cost?");
        //set amount as next int
        int hall = input.nextInt();
        //get user to input cost of decorations
        System.out.println("How much will decorations cost?");
        //set amount as next int
        int decor = input.nextInt();
        //get user to input cost of staff
        System.out.println("How much do the staff cost?");
        //set amount as next int
        int staff = input.nextInt();
        //get user to input cost of miscellaneous objects
        System.out.println("How much do the cost of miscellaneous add up to?");
        //set amount as next int
        int misc = input.nextInt();
        //set the sum of all prices as a variable
        int cost = food + DJ + hall + decor + staff + misc;
        //divide the cost by the cost of tickets (35)
        int tickets = cost/35;
        
        System.out.println("The number of tickets you need to sell to break even is "+tickets);
    }
}
