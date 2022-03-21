package sukkiriJava;

public class SJ_6_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] heights = {172, 149, 152, 191, 155};
		
		for(int h : heights) {
			System.out.print(h + " ");
		}

		System.out.println();

		java.util.Arrays.sort(heights);
		
		for(int h : heights) {
			System.out.print(h + " ");
		}
		
	}

}
