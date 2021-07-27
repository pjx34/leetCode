package leetcode100_150;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.HashSet;

//����Andy��Doris�������ʱѡ��һ�Ҳ������������Ƕ���һ����ʾ��ϲ���������б�ÿ���������������ַ�����ʾ��
//
//����Ҫ�������������ٵ��������ҳ����ǹ�ͬϲ���Ĳ����� ����𰸲�ֹһ������������д𰸲��Ҳ�����˳�� ����Լ������Ǵ���һ���𰸡�
//
//ʾ�� 1:
//
//����:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
//���: ["Shogun"]
//����: ����Ψһ��ͬϲ���Ĳ����ǡ�Shogun����
public class LC0111MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        ArrayList<String> list = new ArrayList<>();
        for (index = 0; index < list1.length; index++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[index].equals(list2[j])&&index+j<=min){
                    if (index+j==min){
                        list.add(list1[index]);
                        min = index+j;
                    }
                    if (index+j<min){
                        list.clear();
                        list.add(list1[index]);
                        min = index+j;
                    }
                }
            }
        }
        String[] strings = new String[list.size()];
        for (int i = 0; i <strings.length ; i++) {
            strings[i] = list.get(i);
        }
        return strings;
    }
}
