package sukkiriJava;

public class SJ_3_8_practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		3-1
//		1. weight == 60;
//		2. ( age1 + age2 ) * 2 > 60
//		3. age % 2 == 1
//		4. name.equals("湊");
		
//		3-2
//		C,D,E
		
//		3-3
		int isHungry = 1;
		String food = "竹輪";
		
		System.out.println("こんにちは");
		
		if(isHungry == 0) {
			System.out.println("お腹いっぱいです");
		} else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		} 
		System.out.println("ごちそうさまでした");	
		
//		三項条件演算子に書き換える　できなかった
//		if(isHungry == 0 ? 
//			System.out.println("お腹いっぱいです") :
//			System.out.println("はらぺこです" + food + "をいただきます" + "\n" + "ごちそうさまでした")	
//			)
//		}
		
//		22~26のコードは下記のように「三項条件演算子」に書き換えられる
//		System.out.println(isHungry == 0 ? "お腹いっぱいです" : "はらぺこです");
		
//		3-4
		boolean tenki = true;
		
		if(tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		} else {
			System.out.println("DVDを見ます");
			System.out.println("寝ます");	
		}
		
//		3-5
		System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
		
		int selected = new java.util.Scanner(System.in).nextInt();
		
		switch (selected) {
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");
				break;
		}
//		1から4のいずれでもない場合は何もしないため、defaultラベルは不要
		
//		3-6
		System.out.println("【数あてゲーム】");
		
		int ans = new java.util.Random().nextInt(10);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("0 ~ 9の数字を入力してください");
			
			int num = new java.util.Scanner(System.in).nextInt();
			
			if ( num == ans ) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}

		}
			
		System.out.println("ゲームを終了します");
		

	}

}
