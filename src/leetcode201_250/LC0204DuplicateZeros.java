package leetcode201_250;

import java.util.ArrayList;

//����һ�����ȹ̶�����������?arr�����㽫�������г��ֵ�ÿ���㶼��дһ�飬���������Ԫ������ƽ�ơ�
//
//ע�⣺�벻Ҫ�ڳ��������鳤�ȵ�λ��д��Ԫ�ء�
//
//Ҫ��������������?�͵�?���������޸ģ���Ҫ�Ӻ��������κζ�����
//ʾ�� 1��
//
//���룺[1,0,2,3,0,4,5,0]
//�����null
//���ͣ����ú�������������齫���޸�Ϊ��[1,0,0,2,3,0,0,4]
public class LC0204DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int length = arr.length,count = 0,num = 0;
        for (int i = 0; i < length; i++) {
            if (arr[count] == 0){
                i++;
                num++;//0�ĸ���
            }
            count++;
        }
        int j = count + num > length?count - 1:-1;//�жϱ߽�0�Ƿ�д
        count--;
       //��count��ߵĶ����������Խ�countλ�õ��Ƶ���ĩβ����0�͸�д��Ҫ�жϱ߽�0�����
        for (int i = length - 1; i >= 0; i--) {
            arr[i] = arr[count];
            if (arr[i] == 0 && count != j)
                if (--i > 0)
                    arr[i] = 0;
            count--;
        }
    }
}
