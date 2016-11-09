
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //what we need to do: ask the person for their name
        //ask the person for their marks and what they were out of
        //tell the percent the percentage they got
        //tell the person the average mark they got 
        //congratulate them if they got better than 90 

        //create input for the user
        Scanner input = new Scanner(System.in);
        //ask user for their name 
        System.out.println("Could you please enter your name");
        //set name as a string
        String name = input.nextLine();

        //greet them using their name politely
        System.out.println("Good day to you sir " + name);

        //as the person what the test was out of on their first test
        System.out.println("What was the test out of?");

        int test1 = input.nextInt();

        System.out.println("What was your mark?");

        int test1r = input.nextInt();

        System.out.println("What was your second test out of?");
        int test2 = input.nextInt();
        System.out.println("What was your mark?");
        int test2r = input.nextInt();
        System.out.println("What was your third  test out of?");
        int test3 = input.nextInt();
        System.out.println("What was your mark?");
        int test3r = input.nextInt();
        System.out.println("What was your fourth  test out of?");
        int test4 = input.nextInt();
        System.out.println("What was your mark?");
        int test4r = input.nextInt();
        System.out.println("What was your fifth  test out of?");
        int test5 = input.nextInt();
        System.out.println("What was your mark?");
        int test5r = input.nextInt();
        int mark1=test1/test1r*100;        
        int mark2=test2/test2r*100;
        int mark3=test3/test3r*100;
        int mark4=test4/test4r*100;
        int mark5=test5/test5r*100;
        System.out.println("Your test percentages are" + mark1 + "," + mark2 + "," + mark3 + "," + mark4 + ","+ mark5);
        int average = mark1+mark2+mark3+mark4+mark5/5;
        System.out.println("Your average in total is "+average);
    }
}
 