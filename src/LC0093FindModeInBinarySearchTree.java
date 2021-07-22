import utils.TreeNode;

import java.util.*;
//����һ������ֵͬ�Ķ�����������BST�����ҳ� BST �е���������������Ƶ����ߵ�Ԫ�أ���
//
//�ٶ� BST �����¶��壺
//
//�������������������ֵС�ڵ��ڵ�ǰ����ֵ
//�������������������ֵ���ڵ��ڵ�ǰ����ֵ
//�����������������Ƕ���������
//���磺
//���� BST [1,null,2,2],
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
