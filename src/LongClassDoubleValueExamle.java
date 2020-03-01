
public class LongClassDoubleValueExamle {
	public static void main(String[] args) {

		// Passing the primitive long value
		Long lValue = new Long(100000);
		System.out.println("Double value: " + lValue.doubleValue());

		// Passing the value in String
		Long lValueInString = new Long("10000000");
		System.out.println("Double value: " + lValueInString.doubleValue());
	}
}