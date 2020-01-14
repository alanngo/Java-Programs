import java.util.*;
/**
 * @Traverses left->root->right
 * */
class InOrderBinaryTree<E extends Comparable<E>> extends BinaryTree<E>
{
    private List<E> cache;

    //helper functions
    private void traverse(TreeNode<E>node)
    {
        if (node==null)
            return;

        //get left node
        traverse(node.getLeftNode());

        //get current
        cache.add(node.get());

        //get right
        traverse(node.getRightNode());
    }

    InOrderBinaryTree(E elem)
    {
        super(elem);
        cache = new ArrayList<>();
    }

    @Override
    public void add( E key) { insertNode(root, key); }

    @Override
    Object[] toArray()
    {
        traverse(root);
        Object[] ret = cache.toArray();
        cache.clear();
        return ret;
    }

    //methods inherited from Object
    //TODO
}
