//��һ����Կ�ַ��� S ��ֻ������ĸ�������Լ� '-'�����ۺţ������У� N �� '-' ���ַ����ֳ��� N+1 �顣
//
//����һ������ K���������¸�ʽ���ַ�����ʹÿ������ǡ�ð��� K ���ַ����ر�أ���һ������������ַ���������С�ڵ��� K��������Ҫ���� 1 ���ַ�����������֮����Ҫ�� '-'�����ۺţ����������ҽ����е�Сд��ĸת��Ϊ��д��ĸ��
//
//�����ǿ��ַ��� S ������ K���������������Ĺ�����и�ʽ����
//
//?
//
//ʾ�� 1��
//
//���룺S = "5F3Z-2e-9-w", K = 4
//�����"5F3Z-2E9W"
//���ͣ��ַ��� S ���ֳ����������֣�ÿ���� 4 ���ַ���
//?    ע�⣬������������ۺ���Ҫɾ����
public class LC0087LicenseKeyFormatting {

    //����������ۺ�
    public static String licenseKeyFormatting1(String s, int k) {
        String replace = s.replace("-", "");
        StringBuilder sb = new StringBuilder();
        int len = replace.length();
        if (len<=k){
            return replace.toUpperCase();
        }
        int digital = len%k;
        if (digital>0){
            sb.append(replace.substring(0,digital));
            sb.append("-");
        }
        for (int i = 0; i+k+digital <= len; i=i+k) {
                sb.append(replace.substring(i+digital,i+digital+k));
                if (i+k+digital!=len){
                    sb.append("-");
                }

        }
        return sb.toString().toUpperCase();
    }

    //����������ۺ�
    public static String licenseKeyFormatting(String s, int k) {
        String replace = s.replace("-", "");
        StringBuilder sb = new StringBuilder(replace);
        int len = replace.length();
        for (int i = len-k; i>=0; i--) {
            if ((len-i)%k==0&&i!=0)
                sb.insert(i,'-');
        }
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        String s1 = licenseKeyFormatting(s, 4);
        System.out.println(s1);
        System.out.println(3%4);
    }
}
