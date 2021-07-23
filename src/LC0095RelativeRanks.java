import java.util.Arrays;

//����?N ���˶�Ա�ĳɼ����ҳ����ǵ�������β�����ǰ������Ӧ�Ľ��ơ�ǰ�����˶�Ա���ᱻ�ֱ����� �����ơ��������ơ� �͡� ͭ�ơ���"Gold Medal", "Silver Medal", "Bronze Medal"����
//
//(ע������Խ�ߵ�ѡ�֣�����Խ��ǰ��)
//
//ʾ�� 1:
//
//����: [5, 4, 3, 2, 1]
//���: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
//����: ǰ�����˶�Ա�ĳɼ�Ϊǰ���ߵģ���˽���ֱ����� �����ơ��������ơ��͡�ͭ�ơ� ("Gold Medal", "Silver Medal" and "Bronze Medal").
//���µ������˶�Ա������ֻ��Ҫͨ�����ǵĳɼ����㽫��������μ��ɡ�
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
