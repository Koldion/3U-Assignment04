
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input 
        Scanner input = new Scanner(System.in);
        //get the person to give the number of inches
        System.out.println("Please tell the number of inches");
        //set the inches as a int
        int inches = input.nextInt();
        //multiply the inches by 2.54 and store it as centimetres

        double centimetres = inches * 2.54;
        //make the program tell user the number of centimetres
        System.out.println(centimetres);



    }
}
