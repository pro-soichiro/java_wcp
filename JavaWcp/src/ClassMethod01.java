import classMethod.human.Human02;

public class ClassMethod01 {
	public static void main(String[] args) {
		Human01 yamada = new Human01();
		System.out.println(yamada.name);
		
		Human02 defult = new Human02();
//		classMethod.human.Human02 defult = new classMethod.human.Human02();
		System.out.println(defult.name);
		
		Human02 sato = new classMethod.human.Human02("佐藤",22);
//		classMethod.human.Human02 sato = new classMethod.human.Human02("佐藤",22);
		System.out.println(sato.name);
		System.out.println(sato.age);
		
	}
}
