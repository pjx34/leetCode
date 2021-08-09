package leetcode151_200;
//��һ�����г��ִ������һ����·���У�����·���ܹ���?n + 1?����ͬ���εĵ���ɡ����г��ִӺ���Ϊ 0?�ĵ�?0?��ʼ���С�
//
//����һ������Ϊ n?����������?gain?������ gain[i]?�ǵ� i?�͵� i + 1?�� �����θ߶Ȳ0 <= i < n�������㷵�� ��ߵ�ĺ��� ��
//ʾ�� 1��
//
//���룺gain = [-5,1,5,0,-7]
//�����1
//���ͣ����θ߶�����Ϊ [0,-5,-4,1,1,-6] ����ߺ���Ϊ 1 ��
public class LC0189FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int last = 0;//�ϴεĸ߶�
        for (int i = 0; i < gain.length; i++) {
            //��ǰ�߶�
            int h = gain[i]+last;
            last = h;
            max = Math.max(max,h);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ints = {-4,-3,-2,-1,4,3,2};
        int i = largestAltitude(ints);
        System
                .out.println(i);
    }
}
