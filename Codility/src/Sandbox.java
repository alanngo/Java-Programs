import java.util.*;

import static java.lang.System.*;

public class Sandbox
{
    static boolean isPalindrome(String str)
    {
        //make case-insensitive
        String s = str.toLowerCase();

        /*
        * base case: 1 letter or blank string
        * then the string is palindrome
        * */
        if (s.length()==0||s.length() ==1)
            return true;

        /*
         * recursive check by stripping the
         * terminal characters of the string
         */
        if (s.charAt(0)==s.charAt(s.length()-1))
            return isPalindrome((s.substring(1, s.length()-1)));

        return false;
    }

    static void test (int outputted, int expected)
    {
        if (outputted!=expected)
            throw new RuntimeException("FAILED, expected: "+expected+" outputted: "+outputted+"\n");
        out.println("passed");
    }

    static void test (boolean x, boolean y)
    {
        if (x!=y)
            throw new RuntimeException("FAILED, expected: "+x+" outputted: "+y+"\n");
        out.println("passed");
    }

    public static void main(String [] args)
    {
//        test(isPalindrome("poop"), true);
//        test(isPalindrome("level"), true);
//        test(isPalindrome("blah"), false);
//        test(isPalindrome("abcdcba"), true);
//        test(BinaryGap.solution(9), 2);
//        test(BinaryGap.solution(529), 4);
//        test(BinaryGap.solution(32), 0);
//        test(BinaryGap.solution(15), 0);
//
//        int sol = OddOccurences.solution(new int[]{9, 3, 9, 3, 9, 7, 9});
        //sorted 3 3 7 9 9 9 9

        Student s0 = new Student("Alan", 1);
        Student s1 = new Student("Alan", 1);

        List<Student> list = new ArrayList<>();

        list.add(s0);
        s0.setName("minh");
        list.add(s1);

        out.println("list contains alan "+list.contains(new Student("Alan",1)));

//        test(sol, 7);
    }

}
