//�������� û���ظ�Ԫ�� ������?nums1 ��?nums2?������nums1?��?nums2?���Ӽ���
//
//�����ҳ� nums1?��ÿ��Ԫ����?nums2?�е���һ��������ֵ��
//
//nums1?������?x?����һ������Ԫ����ָ?x?��?nums2?�ж�Ӧλ�õ��ұߵĵ�һ����?x?���Ԫ�ء���������ڣ���Ӧλ����� -1 ��
//
//?
//
//ʾ�� 1:
//
//����: nums1 = [4,1,2], nums2 = [1,3,4,2].
//���: [-1,3,-1]
//����:
//    ���� num1 �е����� 4 �����޷��ڵڶ����������ҵ���һ����������֣������� -1 ��
//    ���� num1 �е����� 1 ���ڶ�������������1�ұߵ���һ���ϴ������� 3 ��
//    ���� num1 �е����� 2 ���ڶ���������û����һ����������֣������� -1 ��
public class LC0091NextGreaterElementI {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int a = nums1[i];//��������Ԫ�� 4,2,1
            for (int j = 0; j < nums2.length; j++) {
                if (a == nums2[j]){
                    for (int k = j; k < nums2.length; k++) {
                        if (nums2[k]>a){
                            res[i] = nums2[k];
                            break;
                        }
                        else
                            res[i] = -1;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints1 = {4,1,2};
        int[] ints2 = {1,3,4,2};
        int[] ints = nextGreaterElement(ints1, ints2);
        for (int item:ints){
            System.out.println(item);
        }
    }
}