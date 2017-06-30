import java.util.Scanner;

/**
 * This program simulates rolling dice where the number of die sides is
 * defined by the user.
 * Created by kuwu on 2017/06/29.
 */
public class LasVegas {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // created a class called Parse so it can be reused
        // instantiate Class Parse as parse object
        Parse parse = new Parse();

        // called method for getting die sides and rolling dice
        getUserInput(scan);

        // validating for y / n using Parse Class
        while (parse.parse()) {
            // if true, get input and roll dice again
            getUserInput(scan);
        }


    }

    // using Math.random to create the dice rolls
    public static int getTheRoll(int dieSides) {
        int dieRoll = (int) (Math.random() * ((dieSides - 1) + 1) + 1);
        return dieRoll;
    }

    // using Method to group Scanner, input, dice rolls and printout
    public static void getUserInput(Scanner scan) {
        System.out.println("How many sides should the dice have?");
        int sides = scan.nextInt();

        int die1 = getTheRoll(sides);
        int die2 = getTheRoll(sides);
        System.out.println("\n Rolling the dice ...........\n");
        System.out.println("Die 1:  " + die1);
        System.out.println("Die 2:  " + die2);

    }

}




