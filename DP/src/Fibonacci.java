import java.util.*;

public class Fibonacci
{
    static int fib(int x)
    {
        //base case 0, x=0
        if (x==0)
            return 0;

        //base case 1, x=1
        if (x==1)
            return 1;

        //recursive case
        return fib(x-1) + fib(x-2);
    }

    //key: x, value: optFib(x)
    private static Map<Long, Long> cache = new HashMap<>();
    static long optFib(long x)
    {
        //initialization
        final long ZERO = 0;
        final long ONE = 1;

        cache.put(ZERO,ZERO);
        cache.put(ONE,ONE);

        //base case: check cache
        if (cache.containsKey(x))
            return cache.get(x);

        //recursive case: do computations
        cache.put(x,  optFib(x-1)+optFib(x-2));

        return cache.get(x);
    }
}
