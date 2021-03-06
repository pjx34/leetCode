package leetcode151_200;
//给你一个字符串形式的电话号码 number 。number 由数字、空格 ' '、和破折号 '-' 组成。
//
//请你按下述方式重新格式化电话号码。
//
//首先，删除 所有的空格和破折号。
//其次，将数组从左到右 每 3 个一组 分块，直到 剩下 4 个或更少数字。剩下的数字将按下述规定再分块：
//2 个数字：单个含 2 个数字的块。
//3 个数字：单个含 3 个数字的块。
//4 个数字：两个分别含 2 个数字的块。
//最后用破折号将这些块连接起来。注意，重新格式化过程中 不应该 生成仅含 1 个数字的块，并且 最多 生成两个含 2 个数字的块。
//返回格式化后的电话号码。
//示例 1：
//
//输入：number = "1-23-45 6"
//输出："123-456"
//解释：数字是 "123456"
//步骤 1：共有超过 4 个数字，所以先取 3 个数字分为一组。第 1 个块是 "123" 。
//步骤 2：剩下 3 个数字，将它们放入单个含 3 个数字的块。第 2 个块是 "456" 。
//连接这些块后得到 "123-456" 。
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
