//����һ���Ǹ����� num������������λ�ϵ�������ӣ�ֱ�����Ϊһλ��
public class LC0059AddDigits {
    public static int addDigits(int num) {
        int sum = 0;
        do{
            if (num ==0){
                num = sum;
                sum = 0;
            }
            int digital = num%10;
            sum += digital;
            num = num / 10;
        } while (num!=0 || sum>=10);
        return sum;
    }

    public static void main(String[] args) {
        int i = addDigits(19);
        System.out.println(i);
    }
}
