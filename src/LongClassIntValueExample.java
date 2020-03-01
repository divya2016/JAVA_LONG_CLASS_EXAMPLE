
public class LongClassIntValueExample {
	public static void main(String[] args) {

		// Passing the primitive long value
		Long lValue = new Long(100000);
		System.out.println("int value: " + lValue.intValue());

		// Passing the value in String
		Long lValueInString = new Long("10000000");
		System.out.println("int value: " + lValueInString.intValue());
	}
}
