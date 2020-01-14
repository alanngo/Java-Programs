
import static java.lang.System.*;

public class Main
{


    public static void main(String [] args)
    {
        Knapsack bag = new Knapsack();
        int [] items = {1,1,2,2,3};
        for (int i: items)
            bag.add(i);

        out.println(bag);
    }
}
