package extend.phone;

public interface Phone {
//	インターフェースは定数と抽象メソッドを定義可能
	int MAX_NUMBER_DIGITS = 11;
	
//	public abstractが自動で追加されている
	void call(String number);
	
	// defaultメソッドの宣言
    default void powerOff() {
        System.out.println("電源を切ります。");
    }
}
