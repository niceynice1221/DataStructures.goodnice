import java.util.*;

public class DemoAVL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AVLTree tree = new AVLTree();
        /* Constructing tree given in the above figure */
        for(int i = 0; i < 6 ; i++) 
        {
            int x = sc.nextInt();
            tree.root = tree.insert(tree.root, x);
        }
        //tree.root = tree.insert(tree.root, 10);
        //tree.root = tree.insert(tree.root, 20);
        //tree.root = tree.insert(tree.root, 30);
        //tree.root = tree.insert(tree.root, 40);
        //tree.root = tree.insert(tree.root, 50);
        //tree.root = tree.insert(tree.root, 25);
        System.out.println("++Preorder traversal++");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println("++Inorder traversal++");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("++Postorder traversal++");
        tree.postOrder(tree.root);

    }
}
