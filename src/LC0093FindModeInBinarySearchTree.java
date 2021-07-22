import utils.TreeNode;

import java.util.*;
//给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
//
//假定 BST 有如下定义：
//
//结点左子树中所含结点的值小于等于当前结点的值
//结点右子树中所含结点的值大于等于当前结点的值
//左子树和右子树都是二叉搜索树
//例如：
//给定 BST [1,null,2,2],
//
//   1
//    \
//     2
//    /
//   2

public class LC0093FindModeInBinarySearchTree {

    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        getMap(root,map);
        for (int item : map.values()){
            list.add(item);
        }
        Integer[] arr = new Integer[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        for(int item:map.keySet()){
            if (map.get(item)==arr[arr.length-1]){
                list2.add((Integer) item);
            }
        }
        int[] res = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            res[i] = list2.get(i);
        }
        return res;
    }

    public void getMap(TreeNode root, HashMap<Integer,Integer> map){
        if (root==null)
            return;
        if (map.containsKey(root.val))
            map.put(root.val,map.get(root.val)+1);
        else
            map.put(root.val,1);
        getMap(root.left,map);
        getMap(root.right,map);
    }

}
