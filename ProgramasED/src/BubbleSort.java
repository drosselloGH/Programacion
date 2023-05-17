import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = { 3, 8, 2, 1, 5, 4, 6 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}