public class TreeNode<E extends Comparable<E>>
{
    private E elem;
    private TreeNode<E> left, right; //child nodes

    TreeNode(E e)
    {
        elem = e;
        left = null;
        right = null;
    }


    TreeNode<E> getLeftNode(){return left;}
    TreeNode<E> getRightNode(){return right;}

    E get(){return elem;}
    E getLeft(){return getLeftNode().get();}
    E getRight(){return getRightNode().get();}

    void setLeft(E e){left = new TreeNode<>(e);}
    void setRight(E e){right = new TreeNode<>(e);}

    void setLeft(TreeNode<E>e){left = e;}
    void setRight(TreeNode<E>e){right = e;}

    @Override
    public String toString()
    {
        return elem+" ";
    }
}
