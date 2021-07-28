package leetcode100_150;
//����һ���������ַ��б� letters ���б���ֻ����СдӢ����ĸ�������һ��Ŀ����ĸ?target������Ѱ������һ�����б����Ŀ����ĸ�����С��ĸ��
//�ڱȽ�ʱ����ĸ������ѭ�����ֵġ��ٸ����ӣ�
//���Ŀ����ĸ target = 'z' �����ַ��б�Ϊ?letters = ['a', 'b']����𰸷���?'a'
//ʾ����
//����:
//letters = ["c", "f", "j"]
//target = "a"
//���: "c"
public class LC0128FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int lo = 0, hi = letters.length;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (letters[mi] <= target) lo = mi + 1;
            else hi = mi;
        }
        return letters[lo % letters.length];
    }
}
