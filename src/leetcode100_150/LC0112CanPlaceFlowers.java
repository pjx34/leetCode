package leetcode100_150;
//������һ���ܳ��Ļ�̳��һ���ֵؿ���ֲ�˻�����һ����ȴû�С����ǣ���������ֲ�����ڵĵؿ��ϣ����ǻ�����ˮԴ�����߶�����ȥ��
//
//����һ����������??flowerbed ��ʾ��̳�������� 0 �� 1 ��ɣ����� 0 ��ʾû��ֲ����1 ��ʾ��ֲ�˻�������һ����?n ���ܷ��ڲ�������ֲ��������������?n?�仨�����򷵻� true �������򷵻� false��
public class LC0112CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int sum = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i]==0){//Ϊ�յ�
                if ((i-1<0||flowerbed[i-1]==0)&&(i+1==flowerbed.length||flowerbed[i+1]==0)){
                    flowerbed[i]=1;
                    sum++;
                }
            }
        }
        return sum>=n;
    }

    public static void main(String[] args) {
        int[] ints = {1,0,0,0,0,1};
        boolean b = canPlaceFlowers(ints, 2);
        System.out.println(b);
    }
}
