package Tree;


public class TreeClient {

    public static void main(String[] args) {
        
        tree bt = new tree();
        bt.BinaryTree();
        bt.Display();
        // 10 true 20 false false true 30 false true 40 false false
        // System.out.println(bt.find(20));
        bt.preOrder();
        bt.inOrder();
    }
}