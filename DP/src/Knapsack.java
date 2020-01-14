public class Knapsack
{
    private int capacity; //maximum capacity of knapsack
    private int weight;
    private int numItems;

    //constructors
    Knapsack(int c)
    {
        capacity = c;
        numItems = 0;
    }
    Knapsack()
    {this(10);}

    //accessors
    int getWeight(){return weight;}
    int getNumItems(){return numItems;}

    //modifiers
    void add(int item)
    {
        if (weight + item >capacity)
            throw new RuntimeException("cannot add item");
        weight +=item;
        numItems++;
    }


    //inherited from Object
    @Override
    public String toString()
    {
        return "Number of Items: "+numItems+"\n"
                +"Weight: "+ weight+"/"+capacity;
    }

}
