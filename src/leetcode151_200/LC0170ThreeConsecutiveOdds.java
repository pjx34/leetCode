package leetcode151_200;

//����һ���������� arr�������ж��������Ƿ������������Ԫ�ض��������������������ڣ��뷵�� true �����򣬷��� false ��
public class LC0170ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                count = 0;
            } else {
                count++;
                if (count==3)
                    return true;
            }
        }
        return false;
    }
}
