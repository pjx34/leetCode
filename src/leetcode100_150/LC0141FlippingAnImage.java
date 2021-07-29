package leetcode100_150;

import java.util.Arrays;
import java.util.List;

//给定一个二进制矩阵?A，我们想先水平翻转图像，然后反转图像并返回结果。
//
//水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转?[1, 1, 0]?的结果是?[0, 1, 1]。
//
//反转图片的意思是图片中的?0?全部被?1?替换，?1?全部被?0?替换。例如，反转?[0, 1, 1]?的结果是?[1, 0, 0]。
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
