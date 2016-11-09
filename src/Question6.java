
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //what we know: plan a and plan b 
        //plan a would be better in the long run if you use alot of usage
        //create input for the user
        Scanner input = new Scanner(System.in);
        //as user for minutes of use

        System.out.println("How long do you use internet in minutes in daytime");
        int day = input.nextInt();
        System.out.println("How long do you use internet in minutes at the evening");
        int even = input.nextInt();
        System.out.println("How long do you use the internet on the weekends ");
        int wknd = input.nextInt();
        //create and insert the prices into plan a

        double planA1 = ((day - 100) * 25) / 100.0;
        double planA2 = (even * 15) / 100.0;
        double planA3 = (wknd * 20) / 100.0;
        //find the total price for PlanA
        double PlanA = planA1 + planA2 + planA3;
        //find the prices for planB
        double planB1 = ((day - 250) * 45) / 100.0;
        double planB2 = (even * 35) / 100.0;
        double planB3 = (wknd * 25) / 100.0;
        //find total prices for plan b 
        double PlanB = planB1 + planB2 + planB3;
        // Tell the user how much each costs 
        System.out.println("Plan A costs " + PlanA);
        System.out.println("Plan B costs " + PlanB);
        //tell user which one is the better choice
        if (PlanB < PlanA) {
            System.out.println("PlanB  Is the better choice ");
        }
        if (PlanB > PlanA) {
            System.out.println("Plan A is the better choice");
        }
        if (PlanB == PlanA) {
            System.out.println("They are the same");
        }


    }
}
