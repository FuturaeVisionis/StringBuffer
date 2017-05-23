package b;

import java.util.ArrayList;

/**
 * Created by ronald on 19/10/16.
 */
public class Flag {

    public Flag(String apple) {
    }

    public static void main(String[] args) {
        ArrayList<StringBuilder> colour = new ArrayList<>();
        colour.add(new StringBuilder("My"));
        colour.add(new StringBuilder("name"));
        colour.add(new StringBuilder("is"));
        colour.add(new StringBuilder("Capri."));

        //colour.remove(1);

        for (StringBuilder element : colour) {
            System.out.println(element);

        }
        System.out.println("Or like this ...");

        ArrayList<StringBuilder> roof = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder("My");
        StringBuilder stringBuilder1 = new StringBuilder("name");
        StringBuilder stringBuilder2 = new StringBuilder("is");
        StringBuilder stringBuilder3 = new StringBuilder("Capri.");

        roof.add(stringBuilder);
        roof.add(stringBuilder1);
        roof.add(stringBuilder2);
        roof.add(stringBuilder3);


        //roof.remove(1);

        for (StringBuilder run : roof) {
            System.out.println(run);
        }


    }
}
