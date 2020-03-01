public class LongClassEqualsExample {

	public static void main(String[] args) {
		Object obj = 100000;
		Long lValue = new Long(100000);
		System.out.println("equals check :" + lValue.equals(lValue));

		System.out.println("equals check :" + lValue.equals(obj));
	}
}