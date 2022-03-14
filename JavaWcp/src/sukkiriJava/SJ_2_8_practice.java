package sukkiriJava;

public class SJ_2_8_practice {
	
	public static void main(String[] args) {
		
//		2-1
		int x = 5;
		int y = 10;
		String ans = "x + y は" + ( x + y );
		System.out.println(ans);
		
//		2-2
//		1,5,7
//		正解は2,4,5,7
		
//		2について
		double d = 2.0F;
		System.out.println("問題なく" + d + "と出力される");
		
//		1について
//		int num = 3 + 5.0;
//		System.out.println("問題なく" + num + "と出力されない");
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			型の不一致: double から int には変換できません
		
		
//		2-3
		System.out.println("ようこそ占いの館へ");
		
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		
		int fortune = new java.util.Random().nextInt(4);
		fortune ++;
		
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");		
		
	}
	
}
