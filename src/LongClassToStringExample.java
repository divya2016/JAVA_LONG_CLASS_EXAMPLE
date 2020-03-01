
public class LongClassToStringExample {
	public static void main(String[] args) {

		// Passing the primitive long value
		Long lValue = new Long(100000);

		// Normal to String method used
		System.out.println("Value in normal String: " + lValue.toString());

		// Radix to string method used
		System.out.println("Value in radix String: " + Long.toString(lValue, 15));

		// To String method used - long value passed
		System.out.println("Value in long passed " + Long.toString(lValue));
	}
}
