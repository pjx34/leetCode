//����һ�� �� ���� num ��������Ĳ����������ǶԸ����Ķ����Ʊ�ʾȡ����
public class LC0086NumberComplete {
    public int findComplement(int num) {
        int sum=~num;
        String string=Integer.toString(num,2);
        return (((0xffffffff)<<(string.length()))^sum);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = a;
        System.out.println(b);
    }
}
