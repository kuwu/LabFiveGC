import java.util.Scanner;

/**
 * Created by kuwu on 2017/06/29.
 */
public class Parse {

    // validation of y / n for continue, stop or error input
    public static boolean parse() {
        char userChar;
        boolean value = true;
        System.out.println("\n To continue, please enter:   (y/n)");
        Scanner scan = new Scanner(System.in);

        boolean returnValue = false;

        do {
            userChar = scan.next().charAt(0);
            // check for Y or y to continue
            if ((Character.toLowerCase(userChar)) == 'y') {
                value = false;
                returnValue = true;
                // check for N or n to stop
            } else if ((Character.toLowerCase(userChar)) == 'n') {
                value = false;
                returnValue = false;
                // error output for any input other than Yy/Nn
            } else {
                System.out.println(userChar + " is not y or n please re-enter");
            }

        } while (value);

        return returnValue;
    }

}
