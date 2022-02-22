
public class Chapter08 {
	public static void main(String[] args) {
//		1 while
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}
		
//		2 for
		int[] array = {1,2,3,4};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
//		3 拡張for
		for (int number : array ) {
			if (number % 2 == 0) {
				continue;
			}
			System.out.println(number);
		}
	}
}
