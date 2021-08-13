package leetcode201_250;
//�����������ǹ���
//��������һЩ�ǹ� candies����������Ƿָ��źöӵ� n = num_people ��С���ѡ�
//����һ��С���� 1 ���ǹ����ڶ���С���� 2 �ţ��������ƣ�ֱ�������һ��С���� n?���ǹ���
//Ȼ�������ٻص��������㣬����һ��С���� n?+ 1 ���ǹ����ڶ���С���� n?+ 2 �ţ��������ƣ�ֱ�������һ��С���� 2 * n?���ǹ���
//�ظ��������̣�ÿ�ζ�����һ�ζ����һ���ǹ�������������յ���ٴδӶ�����㿪ʼ����ֱ�����Ƿ������е��ǹ���ע�⣬�����������е�ʣ���ǹ�������������ǰһ�η������ǹ��ࣩ����Щ�ǹ�Ҳ��ȫ��������ǰ��С���ѡ�
//����һ������Ϊ num_people��Ԫ��֮��Ϊ candies �����飬�Ա�ʾ�ǹ������շַ�������� ans[i] ��ʾ�� i ��С���ѷֵ����ǹ�������
//ʾ�� 1��
//
//���룺candies = 7, num_people = 4
//�����[1,2,3,1]
//���ͣ�
//��һ�Σ�ans[0] += 1�������Ϊ [1,0,0,0]��
//�ڶ��Σ�ans[1] += 2�������Ϊ [1,2,0,0]��
//�����Σ�ans[2] += 3�������Ϊ [1,2,3,0]��
//���ĴΣ�ans[3] += 1����Ϊ��ʱֻʣ�� 1 ���ǹ��������������Ϊ [1,2,3,1]��
public class LC0205DistributeCandiesToPeople {
    public static int[] distributeCandies1(int candies, int num_people) {
        int givePreTime = 1;//ÿ����Ҫ�������ǹ�����
        int given = 0;//�Ѿ��������ǹ�����
        int[] res = new int[num_people];
        int index = 0;
        for (int i = 1; i <= candies  ; i++) {
            givePreTime = i;
            index = index%num_people;
            if (candies-given>i){
                res[index] = res[index] +i;
            }else{
                res[index] = res[index] +candies-given;
                break;
            }
            given +=  givePreTime;
            index++;
        }
        return res;
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int index = 0;
        while (candies>0){
            res[index%num_people] = res[index%num_people] + Math.min(candies,index+1);
            candies -= Math.min(candies,index+1);
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = distributeCandies(10, 3);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}