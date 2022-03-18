package sukkiriJava;

public class SJ_5_8_practice {
	
//	5-1
	public static void introduceOnself() {
		
		String name = "間宮漱一朗";
		int age = 23;
		double height = 175.5;
		char zodiac = '寅';
		
		System.out.println(name + "といいます。");
		System.out.println(age + "歳の" + zodiac + "年です。");
		System.out.println("身長は" + height + "cmです。");
	}
	
//	5-2
	public static void email(String title,String address,String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title );		
		System.out.println("本文：" + text );
	}

//	5-3
	public static void email(String address,String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");		
		System.out.println("本文：" + text );
	}
	
//	5-4
	public static double calcTriangleArea(double bottom,double height) {
		return (bottom * height) / 2;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
	
	public static void main(String[] args) {
		
//		5-1
		System.out.println("-------  5-1  -------");
		
		introduceOnself();
		
		
//		5-2
		System.out.println("-------  5-2  -------");

		String title = "お世話になっております。";
		String address = "test@gmail.com"; 
		String text = "〇〇の件でご連絡いたしました。その後進展はいかがでしょうか？"; 
		email(title,address,text);
	
//		5-3
		System.out.println("-------  5-3  -------");
		
		email(address,text);

		
//		5-4
		System.out.println("-------  5-4  -------");
		
		double bottom = 10.0;
		double height = 5.0;
		double radius = 5.0;
		
		System.out.println("三角形の底辺の長さが " + bottom + "cm,高さが" + height + "cmの場合、面積は" + calcTriangleArea(bottom,height) + "c㎡");
		System.out.println("円の半径が" + radius + "cmの場合、面積は" + calcCircleArea(radius) + "c㎡");
		
	}
	
}
