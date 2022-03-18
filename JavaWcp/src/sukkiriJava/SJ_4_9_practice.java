package sukkiriJava;

public class SJ_4_9_practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		4-1
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
		
//		4-2
		int[] moneyList = {121902,8302,55100};
		
		for(int i = 0; i < moneyList.length; i++ ) {
			System.out.println(moneyList[i]);
		}

		for(int money : moneyList ) {
			System.out.println(money);
		}
		
//		4-3
		int[] counts = null;
		float[] heights = {171.3F, 175.0F};
//		System.out.println(counts[1]);
//		NullPointerException
//		System.out.println(heights[2]);
//		ArrayIndexOutOfBoundsException
		
//		4-4
		int[] numbers = {3,4,9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int num : numbers){
		    if(num == input){
		        System.out.println("アタリ！");
		    }
		}
		
		
	}

}
