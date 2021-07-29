package leetcode100_150;

import java.util.Arrays;
import java.util.List;

//����һ�������ƾ���?A����������ˮƽ��תͼ��Ȼ��תͼ�񲢷��ؽ����
//
//ˮƽ��תͼƬ���ǽ�ͼƬ��ÿһ�ж����з�ת�����������磬ˮƽ��ת?[1, 1, 0]?�Ľ����?[0, 1, 1]��
//
//��תͼƬ����˼��ͼƬ�е�?0?ȫ����?1?�滻��?1?ȫ����?0?�滻�����磬��ת?[0, 1, 1]?�Ľ����?[1, 0, 0]��
public class LC0141FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            reverseAnArray(image[i]);
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                image[i][j] = image[i][j]==0?1:0;
            }
        }
        return image;
    }

    public void reverseAnArray(int[] arr){
        int[] ints = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ints[i] = arr[i];
        }
        int len = arr.length;
        for (int i = 0; i < arr[i]; i++) {
            arr[i] = ints[len-1];
            len--;
        }
    }
}
