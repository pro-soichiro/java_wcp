package exception;

public class Exception02 {
	public static void main(String[] args) {
        try {
            System.out.println("100 ÷ 0 は？");
            int result = 100 / 0;
            System.out.println("計算結果" + result);
            
        // ArithmeticExceptionクラスの例外が発生した場合の例外処理
        } catch (ArithmeticException e) {
        	
        	// 例外クラスが一致するので、例外処理が実行される
            System.out.println("例外が発生");
        } finally {
            System.out.println("プログラム終了");
        }
    }
}
