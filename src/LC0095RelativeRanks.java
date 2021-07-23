import java.util.Arrays;

//给出?N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal", "Silver Medal", "Bronze Medal"）。
//
//(注：分数越高的选手，排名越靠前。)
//
//示例 1:
//
//输入: [5, 4, 3, 2, 1]
//输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
//解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 “金牌”，“银牌”和“铜牌” ("Gold Medal", "Silver Medal" and "Bronze Medal").
//余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。
public class LC0095RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        int[] arr = Arrays.copyOf(score,score.length);
        int len = arr.length;
        Arrays.sort(arr);
        String[] res = new String[len];
        for (int i = 0; i < len; i++) {
            int rank = arr[i]; //1,2,3,4,5
            for (int j = 0; j < len; j++) {
                if (score[j] == rank){
                    if (i==len-1){
                        res[j] = "Gold Medal";
                        break;
                    }
                    if (i==len-2){
                        res[j] = "Silver Medal";
                        break;
                    }
                    if (i==len-3){
                        res[j] = "Bronze Medal";
                        break;
                    }
                    if (i<len-3){
                        res[j] = (len-i)+"";
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1,5};
        String[] relativeRanks = findRelativeRanks(arr);
        for (String relativeRank : relativeRanks) {
            System.out.println(relativeRank);
        }
    }

}
