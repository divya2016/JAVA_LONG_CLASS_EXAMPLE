
public class LongClassByteValueExample {
	public static void main(String[] args) {

		// Passing the primitive long value
		Long lValue = new Long(100000);
		System.out.println("byte value: " + lValue.byteValue());

		// Passing the value in String
		Long lValueInString = new Long("10000000");
		System.out.println("byte value: " + lValueInString.byteValue());
	}

}
