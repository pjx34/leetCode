package leetcode151_200;
//给你一个由不同字符组成的字符串?allowed?和一个字符串数组?words?。如果一个字符串的每一个字符都在 allowed?中，就称这个字符串是 一致字符串 。
//请你返回?words?数组中?一致字符串 的数目。
//示例 1：
//输入：allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
//输出：2
//解释：字符串 "aaab" 和 "baa" 都是一致字符串，因为它们只包含字符 'a' 和 'b' 。
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/count-the-number-of-consistent-strings
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class LC0166CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            for (int j = 0; j < s.length(); j++) {
                if (!allowed.contains(String.valueOf(s.charAt(j)))) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String all = "fstqyienx";
        String[] words = {"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};
        System.out.println(countConsistentStrings(all,words));
    }
}
