//你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
//
//假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
//
//你可以通过调用?bool isBadVersion(version)?接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
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
