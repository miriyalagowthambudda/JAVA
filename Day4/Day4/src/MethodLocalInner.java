
public class MethodLocalInner {

	public static void main(String[] args) {
		OuterLocal ot = new OuterLocal();
		ot.outerMethod();
		
	}

}
class OuterLocal{
	void outerMethod() {
		System.out.println("inside outer method");
		class Inner{
			void innerMethod() {
				System.out.println("inside inner method");
			}
		}
		
		Inner in = new Inner();
		in.innerMethod();
	}
}
