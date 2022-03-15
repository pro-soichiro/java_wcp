package sukkiriJava;

public class SJ_3_2 {
	
	public static void main(String[] args) {
		
//		文字列の比較
		String fruits[] = {"バナナ","りんご","メロン","スイカ","ブドウ","いちご"};
		
		for(String str : fruits ) {
			if(str.equals("メロン")) {
				System.out.println("このフルーツは" + str + "です");
			}
		}
		
	}
}
