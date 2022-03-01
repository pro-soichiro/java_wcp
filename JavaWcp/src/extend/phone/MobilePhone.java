package extend.phone;


// Phone,Cameraインターフェースを実装したMobilePhoneクラスの宣言
public class MobilePhone implements Phone, Camera{
	private String number;
	
//	コンストラクタ
	public MobilePhone(String number) {
		this.number = number;
	}
	
//	Cameraインターフェースのメソッド実装
	public void takePicture() {
		System.out.println("写真を撮ります。");
	}
	
//	Phoneインターフェースのメソッド実装
	public void call(String number) {
		System.out.println(this.number + " から　" + number + "　に電話をかけます。");
	}
}
