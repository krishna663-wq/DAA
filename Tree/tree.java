package Tree;

import java.util.Scanner;

public class tree {

    class Node{
        int val;
        Node left;
        Node right;
    };
   

    private Node root;
    Scanner sc = new Scanner(System.in);


    public void BinaryTree(){
        root=GenerateTree();
    }
    public Node GenerateTree(){

        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;

        //hlc =has left child
        Boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.left=GenerateTree();
        }

        Boolean hrc=sc.nextBoolean();
        if(hrc){
            nn.right=GenerateTree();
        }
        return nn;

    }
    public void Display(){
        Display(root);
    }
    public void Display(Node node){
        
        if(root==null){
            return;
        }
        String s="";
        s=s+node.val;
        s="<-"+s+"->";

        if(node.left!=null){
            s=node.left.val+s;
        } else{
            s="."+s;
        }
        if(node.right!=null){
            s=s+node.right.val;
        } else{
            s=s+".";
        }
        System.out.println(s);

    }

}