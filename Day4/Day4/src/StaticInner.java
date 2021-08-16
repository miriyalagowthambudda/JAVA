class OuterStatic{
	private static void outerMethod() {
		System.out.println("inside the outer method");
	}
	
	static class StaticInner{
		public static void main(String arg[]) {
			System.out.println("inside the inner class method");
			outerMethod();
		}
		
	}
}
