
public abstract class BinaryTree<E extends Comparable<E>>
{
    protected TreeNode<E> root;
    private int size;

    BinaryTree(E elem)
    {
        size = 0;
        root = new TreeNode<>(elem);
    }

    int size(){return size;}

    protected TreeNode<E> insertNode(TreeNode<E> node, E key)
    {
        // if tree is empty, return a new node
        if (node == null)
           return new TreeNode<>(key);

        //handle left node
        if (key.compareTo(node.get())<=0)
            node.setLeft(insertNode(node.getLeftNode(), key));

        //handle right node
        else if (key.compareTo(node.get())>=0)
            node.setRight(insertNode(node.getRightNode(), key));

        return node;
    }

    abstract void add(E key);
    abstract Object[] toArray();

    //methods inherited from Object
    private String toString(TreeNode<E>node)
    {
        StringBuilder sb = new StringBuilder();
        if (node==null)
            return "";
        sb.append("->").append(toString(node.getLeftNode()));
        sb.append("=>").append(toString(node.getRightNode()));
        return sb.append(node.get()).toString();
    }


    @Override
    public String toString() {return toString(root);}

}
