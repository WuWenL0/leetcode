import java.util.LinkedList;

public class P239 {
    public static void main(String[] args) {
        new P239().maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        int resIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            while(!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.addLast(i);
            if (queue.peek() <= i-k){
                queue.poll();
            }
            if (i+1 >= k){
                res[resIndex++] = nums[queue.peek()];
            }
        }
        return res;
    }
}
