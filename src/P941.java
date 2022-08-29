public class P941 {
    public static void main(String[] args) {
        System.out.println(new P941().validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}));
    }

    /**
     * 双指针
     */
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 2){
            return false;
        }
        int left = 0, right = arr.length-1;
        while(left < arr.length-2 && arr[left] < arr[left + 1 ]){
            left++;
        }
        while(right > 1 && arr[right] < arr[right - 1 ]){
            right--;
        }
        return left == right;
    }

    /**
     * 线性扫描算总数就行
     */
}
