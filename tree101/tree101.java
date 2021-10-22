import java.util.ArrayList;

public class tree101 {
    public static class treeNode {
        int val=0;
        treeNode left= null;
        treeNode right= null;

        treeNode(int val){
            this.val=val;
        }
    }
    public static int size (treeNode node ){
//        if(node == null )
//            return 0;
//
//        return size(node.left)+ size(node.right)+1;

        return node == null ? 0 : size(node.left)+size(node.right )+1;
    }
    public static int height(treeNode node){
        return node == null ? -1 : Math.max(height (node.left),height(node.right ))+1;
    }
    public static int max (treeNode node ){
        return node == null ? -(int) 1e9 : Math.max (node.val, Math.max(max(node.left),max(node.right)));
    }
    public static int min (treeNode node){
        return node == null ? (int)1e9 : Math.min(node.val, Math.min (min(node.left) ,min(node.right)));
    }
    public static boolean find(treeNode node, int data  ){
        if (node == null)
            return false;
        if (node.val == data)
            return true ;
        return find( node.left , data) || find(node.right ,data);
    }

}
