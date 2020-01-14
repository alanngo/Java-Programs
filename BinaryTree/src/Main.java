import java.util.Arrays;

import static java.lang.System.*;
public class Main
{
    private static BinaryTree<Integer> buildTree(int... arr)
    {
        BinaryTree<Integer> tree = new InOrderBinaryTree<>(arr[0]);
        for (int i =1; i<arr.length; i++)
            tree.add(arr[i]);
        return tree;
    }

    public static void main(String[] args)
    {
        int [] arr = {7,5,2,8,2,4,1,3,6,8};
        BinaryTree<Integer> tree = buildTree(arr);

        out.println(tree);
        out.println(Arrays.toString(tree.toArray()));

    }
}
