public class P1295 {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int length = 0;
            while (num!=0){
                num/=10;
                length++;
            }
            if (length%2==0){
                sum++;
            }
        }
        return sum;
    }
    public int findNumbersString(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (String.valueOf(num).length()%2==0){
                sum++;
            }
        }
        return sum;
    }
}
