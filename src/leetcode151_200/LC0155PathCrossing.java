package leetcode151_200;

import java.util.HashSet;
import java.util.Set;

//����һ���ַ��� path������ path[i] ��ֵ������ 'N'��'S'��'E' ���� 'W'���ֱ��ʾ�򱱡����ϡ��򶫡������ƶ�һ����λ��
//�����˴Ӷ�άƽ���ϵ�ԭ�� (0, 0) ����ʼ�������� path ��ָʾ��·�����ߡ�
//���·�����κ�λ���ϳ����ཻ�������Ҳ�����ߵ�֮ǰ�Ѿ��߹���λ�ã��뷵�� True �����򣬷��� False ��
public class LC0155PathCrossing {
    public boolean isPathCrossing(String path) {
        Set<Integer> vis = new HashSet<Integer>();

        int x = 0, y = 0;
        vis.add(getHash(x, y));

        int length = path.length();
        for (int i = 0; i < length; i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case 'N': --x; break;
                case 'S': ++x; break;
                case 'W': --y; break;
                case 'E': ++y; break;
            }
            int hashValue = getHash(x, y);
            if (!vis.add(hashValue)) {
                return true;
            }
        }

        return false;
    }

    public int getHash(int x, int y) {
        return x * 20001 + y;
    }

}
