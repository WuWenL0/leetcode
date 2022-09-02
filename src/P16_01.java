public class P16_01 {
    public int[] swapNumbersMath(int[] numbers) {
        numbers[1] += numbers[0];
        numbers[0] = numbers[1] - numbers[0];
        numbers[1] -= numbers[0];
        return numbers;
    }
    public int[] swapNumbers(int[] numbers) {
        numbers[1] ^= numbers[0];
        numbers[0] = numbers[1] ^ numbers[0];
        numbers[1] ^= numbers[0];
        return numbers;
    }
}
