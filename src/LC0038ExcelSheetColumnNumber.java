//给定一个Excel表格中的列名称，返回其相应的列序号。
//
//        例如，
//
//        A -> 1
//        B -> 2
//        C -> 3
//        ...
//        Z -> 26
//        AA -> 27
//        AB -> 28
public class LC0038ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int mul = 1;
        for (int i = columnTitle.length()-1;i>=0;i--){
            int a = columnTitle.charAt(i)-'A'+1;
            sum += a * mul;
            mul *= 26;
        }
        return sum;
    }
}
