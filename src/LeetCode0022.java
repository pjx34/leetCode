//����һ����������������Ƿ��Ǿ���ԳƵġ�

public class LeetCode0022 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return check(root.left,root.right);
    }

    public boolean check(TreeNode p,TreeNode q){
        if (p == null&&q==null)
            return true;
        if (p ==null || q==null)
            return false;
        return p.val == q.val && check(p.left,q.right) && check(p.right,q.left);
    }
}
