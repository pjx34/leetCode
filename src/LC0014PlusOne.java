import java.util.Arrays;

//����һ���� ���� ��ɵ� �ǿ� ��������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
//���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢�������֡�
//����Լ���������� 0 ֮�⣬��������������㿪ͷ��
public class LC0014PlusOne {
    public static void main(String[] args) {
        int[] ints = {9,8,9};
        int[] ints1 = plusOne(ints);
        System.out.println(Arrays.toString(ints1));
    }


    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        if (digits[length-1]!=9){
            digits[length-1] = digits[length-1] + 1;
            return digits;
        }
        boolean flag = true;//�Ƿ��λ
        boolean isNewArray = false;//�Ƿ�������
        int[] res = new int[length + 1];
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i]==9 && flag){
                flag = true;
                digits[i] = 0;
            }else if(digits[i]!=9 && flag){
                flag = false;
                digits[i] = digits[i] + 1;
            }else if(digits[i]!=9 && !flag){
                flag = false;
                digits[i] = digits[i];
            }
        }
        if (flag) {
            isNewArray = true;
            int i = 1;
            res[0] = 1;
            for (int j = 0; j < length; j++) {
                res[i] = digits[j];
            }
        }
        return isNewArray?res:digits;
    }

}
