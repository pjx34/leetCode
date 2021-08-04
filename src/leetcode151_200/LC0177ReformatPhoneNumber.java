package leetcode151_200;
//����һ���ַ�����ʽ�ĵ绰���� number ��number �����֡��ո� ' '�������ۺ� '-' ��ɡ�
//
//���㰴������ʽ���¸�ʽ���绰���롣
//
//���ȣ�ɾ�� ���еĿո�����ۺš�
//��Σ������������ ÿ 3 ��һ�� �ֿ飬ֱ�� ʣ�� 4 ����������֡�ʣ�µ����ֽ��������涨�ٷֿ飺
//2 �����֣������� 2 �����ֵĿ顣
//3 �����֣������� 3 �����ֵĿ顣
//4 �����֣������ֱ� 2 �����ֵĿ顣
//��������ۺŽ���Щ������������ע�⣬���¸�ʽ�������� ��Ӧ�� ���ɽ��� 1 �����ֵĿ飬���� ��� ���������� 2 �����ֵĿ顣
//���ظ�ʽ����ĵ绰���롣
//ʾ�� 1��
//
//���룺number = "1-23-45 6"
//�����"123-456"
//���ͣ������� "123456"
//���� 1�����г��� 4 �����֣�������ȡ 3 �����ַ�Ϊһ�顣�� 1 ������ "123" ��
//���� 2��ʣ�� 3 �����֣������Ƿ��뵥���� 3 �����ֵĿ顣�� 2 ������ "456" ��
//������Щ���õ� "123-456" ��
public class LC0177ReformatPhoneNumber {

    public String reformatNumber(String number) {
        if( number.length()<=3 ){
            return number;
        }
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<number.length();i++){
            char ch = number.charAt(i);
            if( ch>='0' && ch <='9' ){
                ans.append(ch);
                count = count+1;
                if( count==3 ) {
                    ans.append('-');
                    count=0;
                }
            }
        }
        if( count==0 ){
            ans.deleteCharAt( ans.length()-1 );
        }else if(count==1){
            ans.deleteCharAt( ans.length()-2 );
            ans.insert( ans.length()-2, '-' );
        }

        return ans.toString();
    }

    public static void main(String[] args) {

    }
}
