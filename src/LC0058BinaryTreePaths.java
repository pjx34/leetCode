import java.util.ArrayList;
import java.util.List;

//����һ�����������������дӸ��ڵ㵽Ҷ�ӽڵ��·����
//
//˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
public class LC0058BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        constructPaths(root, "", paths);
        return paths;
    }

    public void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(Integer.toString(root.val));
            if (root.left == null && root.right == null) {  // ��ǰ�ڵ���Ҷ�ӽڵ�
                paths.add(pathSB.toString());  // ��·�����뵽����
            } else {
                pathSB.append("->");  // ��ǰ�ڵ㲻��Ҷ�ӽڵ㣬�����ݹ����
                constructPaths(root.left, pathSB.toString(), paths);
                constructPaths(root.right, pathSB.toString(), paths);
            }
        }
    }

}
