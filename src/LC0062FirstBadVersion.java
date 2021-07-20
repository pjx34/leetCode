//���ǲ�Ʒ����Ŀǰ���ڴ���һ���Ŷӿ����µĲ�Ʒ�����ҵ��ǣ���Ĳ�Ʒ�����°汾û��ͨ��������⡣����ÿ���汾���ǻ���֮ǰ�İ汾�����ģ����Դ���İ汾֮������а汾���Ǵ�ġ�
//
//�������� n ���汾 [1, 2, ..., n]�������ҳ�����֮�����а汾����ĵ�һ������İ汾��
//
//�����ͨ������?bool isBadVersion(version)?�ӿ����жϰ汾�� version �Ƿ��ڵ�Ԫ�����г���ʵ��һ�����������ҵ�һ������İ汾����Ӧ�þ������ٶԵ��� API �Ĵ�����
//
public class LC0062FirstBadVersion {

    //
    public static int firstBadVersion1(int n) {
        if (n == 1)
            return 1;
        int l = 1;
        int r = n;
        int mid = 0;
        while (l<=r){
            mid = l + (r - l)/2;
            if (isBadVersion(mid) == false && isBadVersion(mid+1)==true) {
                return mid + 1;
            }else if (isBadVersion(mid) == false && isBadVersion(mid+1)==false){
                l = mid + 1;
            }else if (isBadVersion(mid) == true && isBadVersion(mid+1)==true){
                r = mid -1;
            }
        }
        return mid;
    }

    public static int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l<r){
            int mid = l + (r-l)/2;
            if (isBadVersion(mid))
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public static boolean isBadVersion(int version){
        if (version >= 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int i = firstBadVersion(1);
        System.out.println(i);
    }
}
