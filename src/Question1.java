
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //get the person to tell the name
        System.out.println("Please tell me your name");
        //put name as int
        
        String name = input.nextLine();
//        

            System.out.println("Hello "+ name +" how was your day");
    }
}
