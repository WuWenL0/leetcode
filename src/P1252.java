public class P1252 {
    public static void main(String[] args) {
        System.out.println(new P1252().oddCells(2, 3, new int[][]{{0, 1}, {1, 1}}));
    }

    public int oddCells(int m, int n, int[][] indices) {
        int[][] arrs = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                arrs[indices[i][0]][j] += 1;
            }
            for (int j = 0; j < m; j++) {
                arrs[j][indices[i][1]] += 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arrs[i][j]%2==1){
                    sum++;
                }
            }
        }
        return sum;
    }
}
