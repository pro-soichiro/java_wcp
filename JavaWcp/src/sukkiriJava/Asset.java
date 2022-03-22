package sukkiriJava;

// 11_6_2

// ア  Asset
// イ  IntangibleAsset
// ウ  Patent

public abstract class Asset {
	
	String name;
	int price;
	
	public Asset(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	
}
