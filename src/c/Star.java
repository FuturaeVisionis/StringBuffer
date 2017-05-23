package c;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by ronald on 19/10/16.
 */
public class Star {
    public static void main(String[] args) {

        int whiteMouse = 0;

        ArrayList<String> astrocat = new ArrayList<>();
        astrocat.add("diamonds");
        astrocat.add("are forever!");

        System.out.println("Using the enhanced for Loop...");
        for (String elements : astrocat) {
        System.out.println(elements);
        }


        System.out.println("Now using the for Loop...");
        for (int x = 0; x < astrocat.size(); x++) {
        System.out.println(astrocat.get(x));
        }


        System.out.println("Now using the do while Loop...");
        do {

            System.out.println(astrocat.get(whiteMouse));
            whiteMouse++;

        } while (whiteMouse < astrocat.size());

        /* The while loop won't run in this programme, because it clashes with the do while.
           Cancel one of the two and it will go.

        System.out.println("Now using the while Loop...");

        while (astrocat.size() > whiteMouse) {

            System.out.println(astrocat.get(whiteMouse));
            whiteMouse++;
        }
        */

            System.out.println("Now using the Iterator...");
            Iterator<String> yellowbee = astrocat.iterator();
        while(yellowbee.hasNext()){
            System.out.println(yellowbee.next());
        }
    }
}







