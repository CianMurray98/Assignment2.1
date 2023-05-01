package ie.atu;
import java.util.ArrayList;

public class FloatableApp {
    public static void main(String[] args) {
        ArrayList<Floatable> list = new ArrayList<Floatable>();     // Create an ArrayList to hold floatable objects.

        list.add(new Submarine("USS MISSISSIPPI", "2012"));
        list.add(new Ferry(800, "IRELAND", 175));
        list.add(new Trawler("UK4781", 199, 12, "UK", 101));

        for(Floatable floatable : list){                    //enhanced for loop
            System.out.println(floatable.printDetails());
        }
    }


}