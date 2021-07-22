import sun.plugin2.jvm.RemoteJVMLauncher;

import java.util.Arrays;

//����һ���ǿյ��ַ������ж����Ƿ����������һ���Ӵ��ظ���ι��ɡ��������ַ���ֻ����СдӢ����ĸ�����ҳ��Ȳ�����10000��
//
//ʾ�� 1:
//
//����: "abab"
//
//���: True
//
//����: �������ַ��� "ab" �ظ����ι��ɡ�
//ʾ�� 2:
//
//����: "aba"
//
//���: False
//ʾ�� 3:
//
//����: "abcabcabcabc"
//
//���: True
//
//����: �������ַ��� "abc" �ظ��Ĵι��ɡ� (�������ַ��� "abcabc" �ظ����ι��ɡ�)
public class LC0083RepeatedSubstringPattern {

    //����
    public static boolean repeatedSubstringPattern1(String s) {
        boolean flag = false;
        for (int i = 1; i < s.length(); i++) {
            String sub = s.substring(0,i);  // a,ab,abc
            for (int j = i; j + i <= s.length(); j+=i) {
                if (flag)
                    break;
                String sub_ = s.substring(j,j+i);
                if (!sub_.equals(sub)){
                    flag = false;
                    break;
                }
                if (j+i==s.length()){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    //kmp
    public boolean repeatedSubstringPattern2(String s) {
        return kmp(s + s, s);
    }

    public boolean kmp(String query, String pattern) {
        int n = query.length();
        int m = pattern.length();
        int[] fail = new int[m];
        Arrays.fill(fail, -1);
        for (int i = 1; i < m; ++i) {
            int j = fail[i - 1];
            while (j != -1 && pattern.charAt(j + 1) != pattern.charAt(i)) {
                j = fail[j];
            }
            if (pattern.charAt(j + 1) == pattern.charAt(i)) {
                fail[i] = j + 1;
            }
        }
        int match = -1;
        for (int i = 1; i < n - 1; ++i) {
            while (match != -1 && pattern.charAt(match + 1) != query.charAt(i)) {
                match = fail[match];
            }
            if (pattern.charAt(match + 1) == query.charAt(i)) {
                ++match;
                if (match == m - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    //�ַ���ƥ��
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }



    public static void main(String[] args) {
        String s = "abcabcabc";
       // System.out.println(repeatedSubstringPattern(s));
    }
}
