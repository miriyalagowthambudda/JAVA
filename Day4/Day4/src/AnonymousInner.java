
public class AnonymousInner {
	static Demo d = new Demo() {
	void show() {
		super.show();
		System.out.println("i am in Anonymous Inner class");
	}	
	};
	
	public static void main(String[] args) {
		d.show();
		
	}

}
class Demo{
	void show() {
		System.out.println("i am in super class method");
	}
}

