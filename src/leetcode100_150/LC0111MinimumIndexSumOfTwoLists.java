package leetcode100_150;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.HashSet;

//假设Andy和Doris想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
//
//你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设总是存在一个答案。
//
//示例 1:
//
//输入:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
//输出: ["Shogun"]
//解释: 他们唯一共同喜爱的餐厅是“Shogun”。
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
