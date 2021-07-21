package utils;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeUtils {

    //中序遍历
    public static void midOrder(TreeNode root){
        if (root==null)
            return;
        midOrder(root.left);
        System.out.print(root.val + " ");
        midOrder(root.right);
    }

    //中序遍历 返回list
    public static List midOrderList(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        midOrderList1(root,list);
        return list;
    }
    public static void midOrderList1(TreeNode root,List list){
        if (root==null)
            return;
        midOrderList1(root.left,list);
        list.add(root.val);
        midOrderList1(root.right,list);
    }

    //前序遍历
    public static void preOrder(TreeNode root){
        if (root==null)
            return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //前序遍历 返回list
    public static List<Integer> preOrderList(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preOrderList1(root,list);
        return list;
    }
    private static void preOrderList1(TreeNode root, ArrayList<Integer> list) {
        if (root==null)
            return;
        list.add(root.val);
        preOrderList1(root.left,list);
        preOrderList1(root.right,list);
    }

    //后续遍历
    public static void postOrder(TreeNode root){
        if (root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    //后续遍历 返回list
    public static List<Integer> postOrderList(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        postOrderList1(root,list);
        return list;
    }

    private static void postOrderList1(TreeNode root, ArrayList<Integer> list) {
        if (root==null)
            return;
        postOrderList1(root.left,list);
        postOrderList1(root.right,list);
        list.add(root.val);
    }
}
