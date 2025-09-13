package Practice_Tree;

import java.util.Scanner;

/**
 * Tree
 */
public class Tree {

    class Node{
        int val;
        Node left;
        Node right;
    };
    private Node Root;
    Scanner sc = new Scanner(System.in);

    public void BinaryTree(){
        Root=GenTree();
    }

    public Node GenTree(){
     int item=sc.nextInt();
     Node nn= new Node(); 
     nn.val=item;

    
     Boolean hlc = sc.nextBoolean();
     if(hlc){
        nn.left=GenTree();
     }
     Boolean hrc = sc.nextBoolean();
     if(hrc){
        nn.right=GenTree();
     }
     return nn;
    }
    public void Display(){
        Display(Root);
    }
    public void Display(Node node){
        if(Root==null){
            return;
        }

        String s="";
        s=s+node.val;
        s="<-"+s+"->";

        if(node.left!=null){
            s = node.left.val+s;
        } else{
            s="."+s;
        }
        if(node.right!=null){
            s = node.right.val+s;
        } else{
            s="."+s;
        }
    }


}