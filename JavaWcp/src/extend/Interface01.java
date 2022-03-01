package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
		
//		System.out.println(mobilePhone.number);
//		これはprivateなのでできない
		
//		Phoneインターフェースのフィールド参照
		System.out.println("電話番号の最大桁数は" + MobilePhone.MAX_NUMBER_DIGITS);
		
		mobilePhone.call("000-2222-5555");
//		mobilePhone.takePicture();
		
//		引数にmobilePhone型を入れているが、classTakePictureによりCamera型にアップキャストされる
		Interface01.classTakePicture(mobilePhone);
		
//		デフォルトメソッドの呼び出し
		mobilePhone.powerOff();
	}
	
	public static void classTakePicture(Camera camera) {
//		アップキャストされた変数のメソッドを呼び出し
		camera.takePicture();
	}
}
